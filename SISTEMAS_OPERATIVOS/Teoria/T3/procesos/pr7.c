#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char **argv)
{
   pid_t id;
   
   id = fork();
   if (id == -1)
     exit(-1);
   else if (id == 0) {
      if (execvp(argv[1], &argv[1]) < 0)
         perror("Error en exec");
   }
   else
     printf("Ejecutado correctamente\n");
     exit(0);
}

   



