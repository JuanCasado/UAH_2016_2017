from calendar import monthrange
def obtener_mes ():
      '''empty==>str,int
      OBJ: pide al usuario un número de mes valido y devuelve el nombre del mes y su número'''
      control_obtener_mes=True
      meses=['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre']
      while control_obtener_mes :
            try:
                  mes=int(input('Introduzca el número de mes: '))
                  if 1<=mes<=12:
                        control_obtener_mes=False
                  else:
                        print('Numero de mes inválido')
            except:
                  print('Numero de mes inválido')
      return meses[mes-1],mes
def mostrar_mes (mes,Nmes,anno):
      '''int,int==>str*42
      OBJ: Al recibir en numero del mes y del año muestra en calendario de ese mes cocreto'''
      print('**********************************')
      print('            ',Nmes,'  ',anno)
      inicio,dias=monthrange(anno,mes)
      print('LU   MA   MI     JU     VI   SA    DO')
      print('        '*inicio,end='')
      for i in range(inicio,dias+inicio):
            print(i-(inicio-1),end='    ')
            if ((i+1)%7)==0 or dias+inicio-i==1:
                  print('\n',end='')
      print('**********************************')
def obtener_anno():
      '''empty==>int
      OBJ: pide al usuario un número de año'''
      control_obtener_anno=True
      while control_obtener_anno :
            try:
                  anno=int(input('Introduzca el año: '))
                  if 0<=anno:
                        control_obtener_anno=False
                  else:
                        print('Año inválido')
            except:
                  print('Año inválido')
      return anno
while True:
      anno=obtener_anno()
      Nmes,mes=obtener_mes()
      mostrar_mes(mes,Nmes,anno)
      

      
      

      
