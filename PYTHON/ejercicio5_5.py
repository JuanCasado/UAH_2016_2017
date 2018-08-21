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
      for x in ['primer', 'segundo']:
            datos.append(punto(real('introduzca la coordenada x del '+ x +' punto: '),real('introduzca la coordenada y del '+ x +' punto: ')))
      return datos
def distancia (datos):
      '''list-->float
      OBJ: da la distancia entre dos puntos'''
      return ((datos[1].x-datos[0].x)**2+(datos[1].y-datos[0].y)**2)**(1/2)
control_main=True
while control_main:
      print(distancia(introducir()))
