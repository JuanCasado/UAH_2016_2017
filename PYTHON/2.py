#Ejercicio 2
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
                  print('El númro introducido no es un entero, pruebe de nuevo')
      return n_entero
#Subprograma que realiza la loteria
def loteria (premiado):
      '''int==>int,int
      OBJ: El usuario introduce una seri de números, se retorna cuando ha hacertado o si no lo ha hecho y cuando ha estado más cerca le lograrlo'''
      CENTINELA=-9999
      control_loteria=True
      contador=1
      proximo=0
      resultado_proximo=0
      resultado=-1
      n_proximo=0
      while control_loteria:
            intento=entero('introduzca un número para jugar, (-9999 para salir): ')
            if contador==1:
                  if intento==premiado:
                        resultado=contador
                  elif intento==CENTINELA:
                        control_loteria=False
                  proximo=abs(premiado-intento)
                  resultado_proximo=contador
            else: 
                  if intento==premiado:
                        resultado=contador
                  elif proximo>abs(premiado-intento):
                        proximo=abs(premiado-intento)
                        n_proximo=intento
                        resultado_proximo=contador
                  if intento==CENTINELA:
                        control_loteria=False
            contador+=1
      return resultado,resultado_proximo,n_proximo
#Programa que hace efectiva la lotería, además la ejecutará infinitas veces
while True:
      resultado,resultado_proximo,n_proximo=loteria(entero('Introduzca el número premiado: '))
      if resultado==-1:
            print('Has perdido :(')
            print('Has estado más cerca con el número: ',n_proximo,' Introducido en la posición: ',resultado_proximo)
      else:
            print('Has ganado!!!!!')
            print('Has acertado en la posición: ',resultado,'. Has estado más cerca con el número: ',n_proximo,', introducido en la posición: ',resultado_proximo)
            
