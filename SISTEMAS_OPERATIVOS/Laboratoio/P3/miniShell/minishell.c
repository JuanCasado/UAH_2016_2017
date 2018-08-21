
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <signal.h>				//Librería para manejar los procesos zombie
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <errno.h>

#include "internas.h"
#include "entrada_minishell.h"
#include "ejecutar.h"

static void manejar_sigchild(int signo)
{
    int estado;

    waitpid(-1, &estado, WNOHANG);		/*	-1 	--> Espera por cualquier hijo
							WNOHANG --> Si no hay hijos por los que esperar devuelve 0	*/						
}

int main(int argc, char *argv[])
{

   char buf[BUFSIZ];
   char *orden;   
   char *token;   

   struct sigaction sa; 
   memset(&sa, 0, sizeof(sa));			//Rellena sa con 0s
   sa.sa_handler = manejar_sigchild;		//Seleccina la función a realizar al llamar a sigaction
   sa.sa_flags = SA_NOCLDSTOP | SA_RESTART;     /*	SA_NOCLDSTOP	--> La señal de sigchild se genera cuando el proceso entra en zombie 
							SA_RESTART	--> Si se produce un error se reinician  las llamadas pendientes	*/
   sigaction(SIGCHLD, &sa, NULL);		//Realiza el proceso de cerrado de zombies según los parámetros indicados

   int control=1;

   while (control)
   {
	imprimir_prompt();
	leer_linea_ordenes(buf);
	
	orden = buf;

	while ((token = strsep(&orden, ";")) != NULL)
        {
            if ((!strcmp(token,"exit"))|(!strcmp(token," exit"))|(!strcmp(token,"exit ")))
               control=0;                               //Cierra la miniShell
            else if (es_ord_interna(token))
               ejecutar_ord_interna(token);             //Orden interna
            else
               ejecutar_linea_ordenes(token);           //Orden externa
        }
   }
   
   exit(EXIT_SUCCESS);
   return 0;
}



