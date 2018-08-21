class punto:
      def __init__(self, x, y):
            self.x=x
            self.y=y
def introducir_datos():
      '''void-->list
      OBJ: pide al usuario las coordenadas de dos puntos'''
      datos=[]
      for k in ['primer','segundo']:
            datos.append(punto(int(input('Introduzca la componente x del'+k+' punto')),int(input('Introduzca la componente y del'+k+' punto'))))
      return datos
def sumar(datos):
      '''list-->reg
      OBJ: suma dos puntos'''
      resultado=punto(datos[0].x+datos[1].x,datos[0].y+datos[1].y)
      return resultado
def restar (datos):
      '''list-->class
      OBJ: resta dos puntos'''
      resultado=punto(datos[0].x-datos[1].x,datos[0].y-datos[1].y)
      return resultado
def seleccion():
      '''void-->int
      OBJ: pide al usuario un numero entre 1 y 3'''
      control_seleccion=True
      while control_seleccion:
            x=input('¿Qué desea hacer? ')
            try:
                  x=int(x)
                  if 1<=x<=3:
                        control_seleccion=False
                  else:
                        print('Valor erroneo')
            except:
                  print('Valor erroneo')
      return x
control_main=True
while control_main:
      print('1 . Sumar')
      print('2 . Restar')
      print('3 . Salir')
      x=seleccion()
      if x==1:
            resultado=sumar(introducir_datos())
            print('[',resultado.x,',',resultado.y,']')
      if x==2:
            resultado=restar(introducir_datos())
            print('[',resultado.x,',',resultado.y,']')
      if x==3:
            control_main=False
