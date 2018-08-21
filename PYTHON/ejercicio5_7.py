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
      for x in ['Cuadrado 1','Cuadrado 2']:
            print(x)
            datos.append(punto(real('Introduzca la coordenada x del vértice inferior izquierdo: '),real('Introduzca la coordenada y del vértice inderior izquierdo: ')))
            datos. append(real('Introduzca el lado: '))
      return datos 
def cuadrado (datos):
      '''list-->list
      OBJ: crea un cuadrado a partir del lado y un punto'''
      cuadrados=[]
      for x in range(0,3,2):
            A=datos[x]
            B=punto(datos[x].x+datos[x+1],datos[x].y)
            C=punto(datos[x].x+datos[x+1],datos[x].y+datos[x+1])
            D=punto(datos[x].x,datos[x].y+datos[x+1])
            centro=punto(datos[x].x+datos[x+1]/2,datos[x].y+datos[x+1]/2)
            cuadrados.append([A,B,C,D,centro])
      return cuadrados
def mayor(cuadrados):
      '''list-->int
      OBJ: dados dos cuadrados dice cual es mayor'''
      if ((cuadrados[0][1].x)-(cuadrados[0][0].x)>(cuadrados[1][1].x)-(cuadrados[1][0].x)):
            resultado=1
      else:
            resultado=2
      return resultado
control_main=True
while control_main:
      cuadrados=cuadrado(introducir())
      for h,v in zip(cuadrados,['Cuadrado 1:','Cuadrado 2']):
            print(v)
            for i,j in zip(h,['Puntoinferior izquierdo: ','Punto inferior derecho: ', 'Punto superior derecho: ','Punto superior izquierdo: ','Centro del cuadrado: ']):
                  print(j,i.x,',',i.y)
      print('El cuadrado más grande es el Cuadrado ',mayor(cuadrados))
