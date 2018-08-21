#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int imprimir = 1;
char *nomprog;
char mapa[80];

int main(int argc, char *argv[])
{
   int i;
   char *ptr;
   nomprog = argv[0];

   printf("DIRECCIONES DE funciones y variables globales y locales --- Dirs. LOGICAS\n\n");
   printf("Dirección de función main: %p \n", main);
   printf("Dirección de variable global inicializada imprimir:   %p\n", &imprimir);
   printf("Dirección de variable global NO inicializada nomprog:   %p\n", &nomprog);
   printf("Dirección de parámetro argv[0]:   %p\n", nomprog);
   printf("Dirección de variable local no inicializada i:   %p\n", &i);
   printf("/************************************************/\n\n\n");

   printf("MAPA DE MEMORIA DEL PROCESO ANTES DE malloc() -OBTENIDA accediendo a /proc/%d/maps \n", getpid());
   sprintf(mapa, "cat /proc/%d/maps", getpid());
   fflush(stdout);
   system(mapa);
   printf(" =======================================  \n\n\n");



   printf("número de argumentos = %d\n", argc);
   printf("Nombre del programa: %s\n",
		  nomprog);

   for(i = 1; i < argc; i++)
   {
       ptr = malloc(strlen(argv[i]) + 1);
       strcpy(ptr, argv[i]);
       if (imprimir) printf("%s\n", ptr);
	   if (i == 1) {
		   printf("DIRECCIÓN DEL VECTOR DINÁMICO --- Dir. LOGICA\n\n");
		   printf("Dirección de la cadena reservada dinámicamente ptr: %p\n", ptr);
		   printf("/************************************************/\n\n\n");
		   
		   
		   printf("MAPA DE MEMORIA DEL PROCESO DESPUÉS DE malloc() -OBTENIDA accediendo a /proc/%d/maps \n", getpid());
		   sprintf(mapa, "cat /proc/%d/maps", getpid());
		   fflush(stdout);
		   system(mapa);
		   printf("  =========================================  \n\n\n");
	   }
	   free(ptr);
   }
   
   return 0;
}
