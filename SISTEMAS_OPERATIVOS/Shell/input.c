#include <stdio.h>
#include<string.h>

#include "shell.h"

#define LEN_MAX 50

void input (char texto [])
{
    memset(texto,0,sizeof(*texto));
    printf("~Mr.BlisfulGrin$  ");
    fgets(texto,LEN_MAX,stdin);
    fflush(stdin);

    convertStringToString(texto);
}
