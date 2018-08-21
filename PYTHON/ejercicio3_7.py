while True:
      try:
            nota=float(input('Introduce la calificacion: '))
            if 0<nota<10:
                  if nota>=8.5:
                        print('')
                        print('**************************************************************************')
                        print('La nota equivale a: A')
                        print('**************************************************************************')
                        print('')
                  elif 8.5>nota>=6.5:
                        print('')
                        print('**************************************************************************')
                        print('La nota equivale a: B')
                        print('**************************************************************************')
                        print('')
                  elif 6.5>nota>=5:
                        print('')
                        print('**************************************************************************')
                        print('La nota equivale a: C')
                        print('**************************************************************************')
                        print('')
                  else:
                        print('')
                        print('**************************************************************************')
                        print('La nota equivale a: D')
                        print('**************************************************************************')
                        print('')
            else:
                  print('')
                  print('La nota debe estar entre 0 y 10')
                  print('')
      except:
            print('')
            print('Escribe un número entre 0 y 10')
            print('')
            
