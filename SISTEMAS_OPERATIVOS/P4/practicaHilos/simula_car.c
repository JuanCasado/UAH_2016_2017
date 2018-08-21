#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#define N_COCHES 8

// Tipo de datos que representa un coche
typedef struct 
{
    int id;
    char *cadena;
} coche_t;

// Array de datos de tipo coche_t
coche_t Coches[N_COCHES];

// Array de marcas de coches para rellenar en char *cadena
char *marcas[N_COCHES]={"Porche","ThatAuto","Seat Panda","Fiat","Mercedes","Audi","Volkswagen","Mini"};

//Array de coches finalizados
volatile int clasificacionFinal[N_COCHES];
volatile int finalCarrera = 0;

//Declaración del mutex
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

// Funcion ejecutada por los hilos
void *funcion_coche(coche_t *pcoche)
{
    int aleatorio;
    unsigned int semilla = (pcoche->id) + getpid(); // semilla generacion num. aleatorios

    
    printf("\tSalida de \t%s    \t%d\n", pcoche->cadena, pcoche->id);

    fflush (stdout);

    // generar numero aleatorios con funcion re-entrante rand_r()
    aleatorio = rand_r(&semilla) % 10;

    sleep(aleatorio);

	
    //CODIGO 4 --> Sección crítica

    if (pthread_mutex_lock(&mutex)!=0)
    {
        perror("ERROR: al bloquear el mutex");
        exit(-1);
    }
    
    if (finalCarrera == 0) // Separa cuando los coches salen de cuando llegan
	printf("--------------------------------------------------\n");

    printf("\tLlegada de \t%s     \t%d\n", pcoche->cadena, pcoche->id);
    clasificacionFinal[finalCarrera] = pcoche->id;    
    finalCarrera++;	

    if (pthread_mutex_unlock(&mutex) != 0)
    {
        perror("ERROR: al desbloquear el mutex");
        exit(-1);
    }


    //CODIGO 2 --> Finaliza el hilo
    pthread_exit (0);

}


int main(void)
{
    pthread_t hilosCoches[N_COCHES]; // tabla con los identificadores de los hilos
    int i;

    //Creacion del mutex
    if (pthread_mutex_init ( &mutex, NULL) != 0)
    {
        perror("ERROR: al crear el mutex");
        exit(-1);
    }


    printf("Se inicia proceso de creacion de hilos...\n\n");
    printf("SALIDA DE COCHES\n");

    for (i=0; i<N_COCHES; i++)
    {
	//CODIGO 1 --> creamos los coches y les asignamos un hilo a cada uno

	Coches[i].id=i;
	Coches[i].cadena=marcas[i];
        if(pthread_create(&hilosCoches[i],NULL,(void *)funcion_coche, &Coches[i]) != 0)
	{
	    perror("ERROR: al crear el hilo");
	    exit(-1);
	}
    }

    printf("\nProceso de creacion de hilos terminado\n\n");

    for (i=0; i<N_COCHES; i++)
    {
	//Código 3 --> El hilo principal espera a los otros

        if(pthread_join(hilosCoches[i],NULL) != 0)
        {
            perror("ERROR: al esperar a los hilos");
            exit(-1);
        }

    }

    pthread_mutex_destroy(&mutex);    

    printf("\nTodos los coches han LLEGADO A LA META \n");
	
    //Código 5 --> Mostramos el array llenado en la sección crítica
    
    for(i = 0; i<N_COCHES; i++)
    {
	
	printf("   Posición: %d COCHE --> %d\n",i+1,clasificacionFinal[i]);
    }
    printf("\n");
    return 0;
}


