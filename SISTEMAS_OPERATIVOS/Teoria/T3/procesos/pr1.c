#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>

int main()
{
	int ident, a;
	
	if ((ident = fork()) == -1)  {
		perror("Error en fork");
		exit(1);
	}
	else if (ident != 0)  {
		a = 1;
		printf("a del primer = %d\n", a);
	}
	else  {
		a = 2;
		printf("a del segundo = %d\n", a);
	}
	return(0);
}
