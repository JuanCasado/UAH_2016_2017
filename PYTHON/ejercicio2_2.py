from math import pi
def que_area ():
      '''OBJ: da tres opciones para que el usuario elija una
      EMPTY==>1or2or3'''
      print('')
      print('Eleija la figura de la que quiere calcular el area')
      print('Introduzca 1 para calcular el area de un círculo')
      print('Introduzca 2 para calcular el area de un cuadrado')
      print('Introduzca 3 para calcular el area de un triángulo')
      print('Introduzca 4 para salir')
      return input('')
def area_circulo (x):
      '''OBJ: calcula el area de un circulo
      float==>float
      float>0'''
      return (x**2)*pi
def area_cuadrado (x):
      '''OBJ: calcula el area de un cuadrado
      float==>float
      float>0'''
      return x**2
def area_triangulo (x,y):
      '''OBJ: calcula el area de un triangulo
      float,float==>float
      float,float>0'''
      return (x*y)/2
while True:
      area=que_area()
      if area == '1':
            print('**********************************************************************')
            print('El área del círculo es: ',area_circulo(float(input('Introduzca el radio del cículo'))))
            print('**********************************************************************')
      elif area=='2':
            print('**********************************************************************')
            print('El área del cuadrado es: ',area_cuadrado(float(input('Introduzaca el lado del cuadrado'))))
            print('**********************************************************************')
      elif area=='3':
            print('**********************************************************************')
            print('El área del triángulo es: ',area_triangulo(float(input('Introduzca la base del triángulo')),float(input('Introduzca la altura del triángulo'))))
            print('**********************************************************************')
      elif area=='4':
            break
      else:
            print('No ha introducido un valor válido')
