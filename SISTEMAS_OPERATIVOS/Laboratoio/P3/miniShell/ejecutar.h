#ifndef EJECUTAR_H
#define EJECUTAR_H

void ejecutar_linea_ordenes(char *);
pid_t ejecutar_orden (const char * , int , int  , int *);
int** crear_pipes (int);

#endif
