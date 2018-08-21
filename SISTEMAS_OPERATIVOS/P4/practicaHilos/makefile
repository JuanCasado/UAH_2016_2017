CC=gcc
CFLAGS=-g -Wall

coches: simula_car.o
	$(CC) $(CFLAGS) simula_car.o -o coches -lpthread -D_REENTRANT

simula_car.o: simula_car.c simula_car.h
	$(CC) $(CFLAGS) -c simula_car.c


.PHONY: clean
clean:
	rm -f coches *.o

.PHONY: run
run:
	clear
	./coches
