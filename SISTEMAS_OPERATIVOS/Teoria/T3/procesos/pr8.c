#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char **argv)
{
    pid_t id, antppid, postppid;
	pid_t pidpadre;   

	pidpadre = getpid();
	id = fork();
    if (id == -1) {
       perror("Error en creación de proceso");
       exit(1); 
    }
   else if (id == 0) {
	   antppid = getppid();
	   sleep(3);
       postppid = getppid();
       printf("El padre inicial del hijo es %d\n", pidpadre);
       printf("El hijo creado es %d\n", getpid());
       printf("El anterior ppid del hijo es %d\n", antppid);
       printf("El ppid actual del hijo es %d\n", postppid);
       exit(0); 
   }
   else {
       sleep(1);
       printf("No hay  hijo\n");
       exit(0); 
   }
} 
   



