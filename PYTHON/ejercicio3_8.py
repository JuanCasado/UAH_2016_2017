while True:
      while True:
            try:
                  entero1=int(input('Introduzca el primer entero:'))
                  entero2=int(input('Introduzca el segundo entero:'))
                  entero3=int(input('Introduzca el tercer entero:'))
                  break
            except:
                  print('Introduzca un número que sea entero')
      if entero1<entero2:
            entero1,entero2=entero2,entero1
      if entero2<entero3:
            entero2,entero3=entero3,entero2
            if entero1<entero2:
                  entero1,entero2=entero2,entero1
      print(entero1,entero2,entero3)
      
