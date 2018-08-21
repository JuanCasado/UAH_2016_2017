def meses_(mes):
      '''OBJ: transforma el numero del mes en el nombre del mes y lo muestra en pantalla
      int==>empty'''
      meses=['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre']
      if 1<=mes<=12:
            print(meses[mes-1])
      else:
            print('Introduzca un número entre 1 y 12')

while True:
      try:
            meses_(int(input('Introduzca el número de mes: ')))
      except:
            print('Introduzca un número entre 1 y 12')
