CC=gcc
CFLAGS=-g -Wall
H=shell.h
Shell: main.o prompt.o input.o convertStringToString.o distribuidor.o pedirMostrar.o whoAmI.o
	$(CC) $(CFLAGS) $^ -o Shell
main.o: main.c $(H)
	$(CC) $(CFLAGS) -c $<
promt.o: promt.c
	$(CC) $(CFLAGS) -c $<
input.o: input.c $(H)
	$(CC) $(CFLAGS) -c $<   
convertStringToString.o: convertStringToString.c
	$(CC) $(CFLAGS) -c $<
distribuidor.o: distribuidor.c $(H)
	$(CC) $(CFLAGS) -c $<
whoAmI.o: whoAmI.c $(H)
	$(CC) $(CFLAGS) -c $<
pedirMostrar.o: pedirMostrar.c $(H)
	$(CC) $(CFLAGS) -c $<
.PHONY: clean
clean:
	rm -f Shell *.o
run:
	clear
	./Shell
