CC=gcc
CFLAGS=-g -Wall

miniShell: minishell.o entrada_minishell.o libmemoria.o ejecutar.o redirecciones.o libshell.a 
	$(CC) $(CFLAGS) -L./ -lshell ejecutar.o minishell.o entrada_minishell.o libmemoria.o redirecciones.o -o miniShell

minishell.o: minishell.c internas.h entrada_minishell.h ejecutar.h
	$(CC) $(CFLAGS) -c minishell.c

entrada_minishell.o: entrada_minishell.c entrada_minishell.h
	$(CC) $(CFLAGS) -c entrada_minishell.c

libmemoria.o: libmemoria.c libmemoria.h
	$(CC) $(CFLAGS) -c libmemoria.c

ejecutar.o : ejecutar.c ejecutar.h parser.h libmemoria.h redirecciones.h
	$(CC) $(CFLAGS) -c ejecutar.c 

redirecciones.o : redirecciones.c redirecciones.h
	$(CC) $(CFLAGS) -c redirecciones.c


.PHONY: clean
clean:
	rm -f miniShell *.o

.PHONY: run
run:
	clear
	./miniShell 
