class punto ():
      def __init__(self,_x,_y):
            self.x=_x
            self.y=_y
def real(texto):
      '''str-->float
      OBJ: pise al usuario un númeo real'''
      control_real=True
      while control_real:
            try:
                  x=float(input(texto))
                  control_real=False
            except:
                  print('Caracter inválido')
      return x
def introducir():
      '''void-->list
      OBJ: retorna una lista con dos registros'''
      datos=[]
      datos.append(punto(real('Introduzca la coordenada x del vértice inferior izquierdo: '),real('Introduzca la coordenada y del vértice inderior izquierdo: ')))
      datos. append(real('Introduzca el lado'))
      return datos 
def cuadrado (datos):
      '''list-->list
      OBJ: crea un cuadrado a partir del lado y un punto'''
      A=datos[0]
      B=punto(datos[0].x+datos[1],datos[0].y)
      C=punto(datos[0].x+datos[1],datos[0].y+datos[1])
      D=punto(datos[0].x,datos[0].y+datos[1])
      centro=punto(datos[0].x+datos[1]/2,datos[0].y+datos[1]/2)
      return [A,B,C,D,centro]
control_main=True
while control_main:
      for i,j in zip(cuadrado(introducir()),['Puntoinferior izquierdo: ','Punto inferior derecho: ', 'Punto superior derecho: ','Punto superior izquierdo: ','Centro del cuadrado: ']):
            print(j,i.x,',',i.y)
