def descomposicion(n):
      '''int-->void
      OBJ:dedcompone un numero e sus cifras'''
      if n==0:
            return''
      if n>0:
            print(descomposicion(n//10),'       ',(n-(n//10)*10),end='')
      return''
descomposicion(int(input('Introduzca un numero')))
