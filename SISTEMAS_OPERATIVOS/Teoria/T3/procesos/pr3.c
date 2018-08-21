#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
   pid_t id;
   int i;
   int nproc = 5;

   for ( i = 0; i < nproc; i++)
   {
      id = fork();
      
      if (id != 0)
        break;
   }
   printf("El padre del proceso %d es %d\n\n", getpid(), getppid());
   getchar();
   return 0;
}

