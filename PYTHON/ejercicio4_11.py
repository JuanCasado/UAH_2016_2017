control_main=True
suma=[]
registro=[]
for i in range(25):
      suma.append(0)
      registro.append(i+1)
while control_main:
      x=input('Introduzca una palabra: ')
      if x == 'fin':
            for i in range(25):
                  print('Palabras longitud ',registro[i], ': ',suma[i])
            control_main=False
      elif len(x) <= 25:
            suma[len(x)-1]+=1
      else:
            print('Valor introducido erroneo')
            
            
