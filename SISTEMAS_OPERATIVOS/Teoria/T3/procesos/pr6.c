#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char **argv)
{
   int n;
  
   if ((n = fork()) == -1)
   {
     printf("Error en fork()\n");
     exit(1);
   }
   else if (n == 0) {
     printf("Hijo\n"); 
   }
   else {
     printf("Padre\n");
     wait(NULL);
     printf("Ya terminó el hijo\n");
   }
   return 0;
}



