#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main(void) {
 
   pid_t  id;

   id = fork();
   if (id == -1) {
     perror("Error en fork"); 
     exit(1);
   }

   if (id == 0) {
     while (1) 
	printf("Hola: soy el hijo\n");
   } 
   else {
     while (1)
	 printf("Hola: soy el padre\n");
   }
   return 0;
} /* Fin del main */
