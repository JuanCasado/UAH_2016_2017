#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>

#include "parser.h"
#include "ejecutar.h"
#include "libmemoria.h"
#include "redirecciones.h"

int** crear_pipes (int nordenes)
{
   int ** pipes = NULL ;
   int i;
   
   pipes = (int **) malloc(sizeof(int *) * (nordenes - 1));
   for(i = 0; i < (nordenes - 1); i++)
   {
   	pipes[i] = (int *) malloc(sizeof(int) * 2);
	pipe(pipes[i]);		//Creamos las pipes necesarias cada vez sobre la memoria previamente reservada
   }
   return(pipes);
}

pid_t ejecutar_orden (const char *orden , int entrada , int salida , int *pbackgr)
{
   char **args;
   pid_t pid;
   int indice_ent = -1, indice_sal = -1; 		/* por defecto, no hay < ni > */
  
   if ((args = parser_orden(orden, &indice_ent, &indice_sal, pbackgr)) == NULL)		//Si args está vacío solo hay que cerrar la entrada y la salida si son distintas del valor predeterminado
   {
	if (entrada != STDOUT_FILENO)
       	    close(entrada);

      	if (salida != STDOUT_FILENO)
       	    close(salida);
   	
	return(-1);
   }
   //Si hay redireccion de entrada
   if (indice_ent != -1)
	redirec_entrada(args, indice_ent, &entrada);
   //Si hay redireccion de salida
   if (indice_sal != -1)
        redirec_salida(args, indice_sal, &salida);


   pid = fork();

   if (pid < 0)
   {
	perror("Fallo en la creación del hijo");	

	if (entrada != STDIN_FILENO)
       	    close(entrada);

       	if (salida != STDOUT_FILENO)
       	    close(salida);
	
  	return(-1);
   }
   else if (pid == 0)
   {
	//Si hay redireccion de entrada
	if (entrada != STDIN_FILENO)		//Ponemos el descriptor obtenido en el open
	{
	    if (dup2(entrada,STDIN_FILENO) < 0)		
	    {
		perror("Error en el dump2 de entrada");
		return(-1);
	    }
	    close(entrada);
	}
	
	//Si hay redirccion de salida
	if (salida != STDOUT_FILENO)		//Ponemos el descriptor obtenido en el open
	{
	    if(dup2(salida,STDOUT_FILENO) < 0)
	    {
		perror("Error en el dump2 de salida");
                return(-1);
	    }
	    close(salida);
	}

	if (execvp(args[0], args) < 0) 		//Ejecutamos la orden después de haber sido tratada
	{
	    perror("Error en execvp");
	    exit(-1);
	}
	return -1;
   }
   else	
   {	
	//Dejamos los descriptores en su valor original
	
	if (entrada != STDIN_FILENO)		
	    close(entrada);
	if (salida != STDOUT_FILENO)
	    close(salida);

	free_argumentos(args);		
	return pid;
   }	
}
 
void ejecutar_linea_ordenes(char *orden)
{
   char **ordenes;
   int nordenes;
   pid_t *pids = NULL;
   int **pipes;
   int backgr;	

   int i;
   int entrada;
   int salida;
	
   ordenes = parser_pipes(orden,&nordenes);

   pids = (pid_t *)malloc(sizeof(pid_t) * nordenes);	//Reservamos memoria para pids
  
   pipes = crear_pipes(nordenes); 

   for (i = 0; i < nordenes ; i++)
   {
	if (nordenes > 1)
	{
	    if (i == 0)					//Primera orden si hay varias
	    {
	        entrada = STDIN_FILENO;
	        salida = pipes[0][1];
	    }

	    else if (i == nordenes-1)			//Última orden si hay varias
   	    {
	        entrada = pipes[nordenes-2][0];
	        salida = STDOUT_FILENO;
	    }	

	    else					//Orden intermedia si hay varias
	    {
	        entrada = pipes[i-1][0];
	        salida = pipes[i][1];
	    }
	    
	}
	else						//Si solo hay una orden
	{
 	    entrada = STDIN_FILENO;
	    salida = STDOUT_FILENO;
	}

	pids[i] = ejecutar_orden(ordenes[i], entrada, salida,  &backgr);
   }

   if ((backgr) & (pids[nordenes-1] > 0))		//Esperar si no hay background al último hijo
        waitpid(pids[nordenes-1], &pids[nordenes-1], 0);
  
   free_ordenes_pipes (ordenes , pipes , nordenes );
   free (pids );
}
