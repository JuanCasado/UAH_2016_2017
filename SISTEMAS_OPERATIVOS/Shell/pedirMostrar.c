#include <stdio.h>

#include "shell.h"

#define LEN_MAX 50
int pedirMostrar(void)
{
    char texto [LEN_MAX];
    printf("ShellDice$ ");
    input(texto);
    promt(texto);
    return 0;
}
