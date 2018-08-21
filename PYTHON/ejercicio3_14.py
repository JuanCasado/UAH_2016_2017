def contar ():
      num=int(input('Introduce un número (-9999 Para salir)'))
      total=0
      positivos=0
      negativos=0
      while num!=-9999:
            num=int(input('Introduce un número (-9999 Para salir)==>'))
            total+=1
            if num<0:
                  positivos+=1
            elif num>0:
                  negativos+=1
      return total,positivos,negativos
while True:
      n_total,n_positivos,n_negativos=contar()
      print('Hay ',n_total,' numeros de los que ',n_positivos,' son positivos y ',n_negativos,' son negativos')
