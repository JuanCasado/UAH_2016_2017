#Ejercicio 4
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
def es_menor(x,y):
      '''int,int==>boolean
      OBJ: dice si el primer número es menor qu el segundo'''
      return x<y
def esta_entre(x,y,z):
      '''int,int,int==>boolean
      OBJ: dice si y está entre x y z'''
      return x<=y<=z
def distancia(x,y):
      '''int,int==>int
      OBJ: da la distancia entre dos números'''
      return abs(x-y)
while True:
      inferior=entero('Introduzca el primer inferior: ')
      superior=entero('Introduzca el límite superior: ')
      if es_menor(inferior,superior):
            numero=entero('Introduzca el número entre los límites')
            if esta_entre(inferior,numero,superior):
                  if es_menor(distancia(inferior,numero),distancia(numero,superior)):
                        for i in range(inferior,numero):
                              print(i,end='-')
                        print('')
                  elif es_menor(distancia(numero,superior),distancia(inferior,numero)):
                        for i in range(numero+1,superior+1):
                              print(i,end='-')
                        print('')
                  else: print('Las distancias son iguales')
            else:
                  print('El número no está entre los límites, vuelva a intentarlo')
      else:
            print('El límite inferior no puede ser mayor que el superior')
                        
                  
            
            
      
