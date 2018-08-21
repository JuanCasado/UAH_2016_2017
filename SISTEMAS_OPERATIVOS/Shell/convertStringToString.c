#include <stdio.h>

#define LEN_MAX 50

void convertStringToString(char texto[])
{
    for (int x= (LEN_MAX-1); x>=0 ;x--)
    {
        if (texto[x]=='\n')
        {
            texto[x]='\0';
        }
    }
}
