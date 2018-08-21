def fib (n):
      '''int-->int
      OBJ: calcula la sucesión de fibonacci'''
      if n<=1:
            resultado=1
      else:
            resultado=fib(n-1)+fib(n-2)
      return resultado
while True:
      print(fib(int(input('Introduzca un numero'))))
