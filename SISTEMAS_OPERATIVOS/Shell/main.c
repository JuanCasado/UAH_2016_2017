#include <stdio.h>
#include <string.h>

#include "shell.h"

#define LEN_MAX 50
#define NUMERO_COMANDOS 4

int main()
{
    char comando[NUMERO_COMANDOS][LEN_MAX];
    strcpy(comando[0], "hola");
    strcpy(comando[1], "whoAmI");
    strcpy(comando[2], "comandList");
    strcpy(comando[3], "exit");
    char texto [LEN_MAX];

    int control=1;
    int resultado;
    int contador=0;

    printf("Welcome admin, it's nice to see you here :D\n");

    while(control)
    {
        input(texto);
	resultado=distribuidor(texto);

        if (resultado==0)
	    contador=0;
	if (resultado==-3)
	{
	    promt("Closing Shel...");
	    control=0;
	}
        else if (resultado==-2)					//Comando no reconocido
            promt("\tComando no reconocido\n");
	else if (resultado==-1)
	{
	    contador++;
	    if (contador>3)
	    	distribuidor("comandList");
	}
    }
    return 0;
}
