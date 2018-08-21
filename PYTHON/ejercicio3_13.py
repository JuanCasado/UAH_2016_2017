def menu_del_dia (letra):
      '''OBJ: Transforma la letra de día introduciada al númaro del dia correspondiente
      str==>int'''
      if letra==('L'or'M'or'X'or'J'or'V'or'S'or'D'):
            if letra == 'L':
                  ndia=0
            elif letra=='M':
                  ndia=1
            elif letra=='X':
                  ndia=2
            elif letra=='J':
                  ndia=3
            elif letra=='V':
                  ndia=4
            elif letra=='S':
                  ndia=5
            elif letra =='D':
                  ndia=6
      else:
            print('El valor introdcido es erroneo')
            ndia=7
      return ndia
dias=['lunes','martes','miércoles','jueves','viernes','sabado','domingo']
while True:
      dia=menu_del_dia(input('Introduzca la letra correspondiente al día de la semana (L,M,X,J,V,S,D): '))
      if dia!=7:
            print('Menú del ', dias[dia])

