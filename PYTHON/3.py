#Ejercicio 3
def entero (x):
      '''srt==>int
      OBJ: Pide al usuario un número entero mayor que 0 según el texto introducido
      PRE: x=srt'''
      control_entero=True
      while control_entero:
            try:
                  n_entero=int(input(x))
                  if n_entero>0:
                        control_entero=False
                  else:
                        print('El númro introducido no es un entero mayor que 0, pruebe de nuevo')
            except:
                  print('El númro introducido no es un entero, pruebe de nuevo')
      return n_entero
#subprograma que crea la serie
def serie (n):
      '''int==>none
      OBJ: muestra en pantalla la serie requerida'''
      numerador=1
      denominador=2
      suma=1
      for i in range(n-1):
            print(numerador,'/',denominador,end=',')
            numerador=numerador+denominador
            denominador=(numerador-denominador)+(numerador-denominador)*denominador
      print(numerador,'/',denominador)
#Programa que ejecuta la serie infinitas veces
while True:
      serie(entero('Introduzca el límite de la serie: '))
