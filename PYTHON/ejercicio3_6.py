def es_entero (x):
      try:
            int(x)
            return True
      except:
            return False
def es_real (x):
      try:
            float(x)
            return True
      except:
            return False
def potencia (base,exponente):
      resultado=1
      for i in range(abs(exponente)):
            resultado*=base
      if exponente <0:
            resultado=(1/resultado)    
      return resultado

while True:
      base=input('Introduzca el número del que quiere calcular la potencia (base): ')
      exponente=input('Introduzca la potencia a la que quiere elevar el número anterior(exponente): ')
      if es_real(base):
            base=float(base)
            if es_entero(exponente):
                  exponente=int(exponente)
                  print(potencia(base,exponente))
            else:
                  print('Introduzca un número entero como exponente')
      else:
            print('Introduzaca un número real como base')
            
      
