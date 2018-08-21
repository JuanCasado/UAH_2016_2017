#include <stdio.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <stdlib.h>
#include <fcntl.h>
#include <sys/wait.h>
#include <unistd.h>
#include <string.h>

#include "redirecciones.h"

void redirec_entrada (char **args , int indice_entrada , int *entrada )
{
    int temporal;	//Permite controlar los posibles errores de apertura
    temporal=open(args[indice_entrada+1],O_RDONLY,S_IRUSR);	//Abrimos en modo lectura con permisos de lectura
    if (temporal != -1)
	*entrada=temporal;
    else
	perror("Error al abrir el archivo en modo lectura");
    args[indice_entrada]=args[indice_entrada+1]=NULL;		//Eliminamos el "<" y el nombre del archivo de args
}

void redirec_salida (char ** args , int indice_salida , int *salida)
{
    int temporal;	//Permite controlar los posibles errores de apertura
    temporal=open(args[indice_salida+1],O_WRONLY|O_CREAT|O_TRUNC,S_IXUSR|S_IWUSR);	//Abrimos en modo escritura; si el archivo no existe lo creamos y si tenía algo lo sobreescribimos; con permisos de escritura y ejecución	
    if (temporal != -1)
	*salida=temporal;
    else
	perror("Error al abrir el archivo en modo escritura");
    args[indice_salida]=args[indice_salida+1]=NULL;		//Eliminamos el ">" y el nombre del archivo de args
}
