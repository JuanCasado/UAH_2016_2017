#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
   int n;

   if ((n = fork()) == -1)
   {
      printf("Error en creación de proceso\n");
      exit(1);
   }
   else if ( n  == 0 )
   {
     printf("Valor de fork: %d\n", n);
     printf("Identificador de proceso: %d\n", getpid());
   }
 else
   {
     printf("Valor de fork: %d\n", n);
     printf("Identificador del proceso: %d\n", getpid());
   }
   return 0;
}
