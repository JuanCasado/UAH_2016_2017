#include <stdio.h>
#include <string.h>

#include "shell.h"

#define LEN_MAX 50
#define NUMERO_COMANDOS 4

int distribuidor(char texto[])
{
    char comando[NUMERO_COMANDOS][LEN_MAX];
    strcpy(comando[0], "hola");
    strcpy(comando[1], "whoAmI");
    strcpy(comando[2], "comandList");
    strcpy(comando[3], "exit");

    int resultado;

    if (strcmp(texto,comando[0])==0)        //hola-->muestra por pantalla lo sigiente que se escriba
	resultado=pedirMostrar();
    else if (strcmp(texto,comando[1])==0)   //whoAmI-->mustra el usuario
        resultado=whoAmI();
    else if(strcmp(texto,comando[2])==0)    //comandList-->mustra todos los comados
    {
        resultado=0;
        char formato[LEN_MAX]=". ";
        int numero;
        char elemento[LEN_MAX];

        for(int x=0;x<NUMERO_COMANDOS;x++)
        {
            numero=x;
            sprintf(elemento,"%d",numero);
            strcat(elemento,formato);
            strcat(elemento, comando[x]);
            promt(elemento);
        }
    }
    else if(strcmp(texto,comando[3])==0)    //exit-->cierra la Shell
        resultado=-3;
    else if(strcmp(texto,"")==0)	    //Comando vacio
	resultado=-1;
    else                                    //Comando no reconocido
        resultado=-2;
    return resultado;
}

