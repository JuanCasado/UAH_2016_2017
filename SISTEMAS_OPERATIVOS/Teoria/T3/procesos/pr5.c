#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char **argv)
{
   pid_t id;
   
   id = fork();
   switch(id) {
      case -1: 
        exit(-1);
      case 0:
        if (execvp(argv[1], &argv[1]) < 0)
          perror("Error en exec");
      default:
          printf("Fin de proceso padre o hijo?\n");
   }
   return 0;  
}


