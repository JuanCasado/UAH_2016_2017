import math
while True:
      print('1. Seno')
      print('2. Coseno')
      print('3. Tangente')
      print('4. Cotangente')
      print('5. Secante')
      print('6. Cosecante')
      print('0. Salir')
      seleccion=input('Elija una opción: ')
      if seleccion=='0':
            break
      try:
            angulo=float(input('Introduzca el valor del ángulo: '))
            if seleccion=='1':
                  print('********************************************************************************************')
                  print(math.sin(angulo))
                  print('********************************************************************************************')
            elif seleccion=='2':
                  print('********************************************************************************************')
                  print(math.cos(angulo))
                  print('********************************************************************************************')
            elif seleccion=='3':
                  print('********************************************************************************************')
                  print(math.tan(angulo))
                  print('********************************************************************************************')
            elif seleccion=='4':
                  print('********************************************************************************************')
                  print(1/math.tan(angulo))
                  print('********************************************************************************************')
            elif seleccion=='5':
                  print('********************************************************************************************')
                  print(1/math.cos(angulo))
                  print('********************************************************************************************')
            elif seleccion=='6':
                  print('********************************************************************************************')
                  print(1/math.sin(angulo))
                  print('********************************************************************************************')
            else:
                  print('')
                  print('Escriba el número correspondiente a una de las opciones')
                  print('')
      except:
            print('')
            print('Introduzca un valor de ángulo correcto')
            print('')
