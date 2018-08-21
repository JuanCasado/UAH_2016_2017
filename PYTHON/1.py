#Programa que implementa el procedimiento de ej 1
def entero (x):
      '''srt==>int
      OBJ: Pide al usuario un número entero según el texto introducido
      PRE: x=srt'''
      control_entero=True
      while control_entero:
            try:
                  n_entero=int(input(x))
                  control_entero=False
            except:
                  print('El númro introducido no es un entero, pruebe de nuevo:')
      return n_entero
#este es el procedimiento que pide el ejercicio
def onda (inicio,centro,final,repeticiones):
      '''int,int,int,int==>none
      OBJ: muestra en pantalla una onda que acabe y empiece por inicio, y se repita un número de veces'''
      x=0 #variable para controlar si los numero crecen en la onda o decrecen
      for veces in range(repeticiones):
            if inicio<centro: x=1
            else: x=-1
            for i in range(inicio,centro,x):
                  print(i,end='  ')
            if centro<final: x=1
            else: x=-1
            for i in range (centro,final,x):
                  print(i,end='  ')
            if final<inicio: x=1
            else: x=-1
            for i in range (final,inicio,x):
                  print(i,end='  ')
      print(inicio)
while True:
      onda(entero('Introduzca el número de inicio de la onda: '),entero('Introduzca el centro de la onda: '),entero('Introduzca el final de la onda: '),entero('Introduzca cuantas veces se repite la onda: '))
