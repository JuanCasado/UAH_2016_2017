def estadistica ():
      suma=[]
      for i in range(25):
            suma.append(0)
      control_estadistica=True
      while control_estadistica:
            x=input('Introduzca una palabra: ')
            if x=='fin':
                  control_estadistica=False
            elif len(x)<=25:
                  suma[len(x)-1]+=1
            elif len(x)>25:
                  print('Palabra demasiado larga')
            else:
                  print('Valor introducido erroneo')
      return suma
def mostrar_resultados(x):
      for i in range(25):
            print('Palabras longitud ',i+1, ': ',x[i])
mostrar_resultados(estadistica())
