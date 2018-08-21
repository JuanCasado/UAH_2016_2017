def pedir_entero ():
      control_pedir_entero=True
      while control_pedir_entero:
            try:
                  entero=int(input('Introduzca el valor limite: '))
                  if entero>0:
                        return entero
                  else:
                        print('Valor no válido')
                  control_pedir_entero=False
            except:
                  print('Valor no válido')
def serie (x):
      suma=0
      n=0
      while suma<x:
            n+=1
            suma+=1/n
      return n
while True:
      print(serie(pedir_entero()))
