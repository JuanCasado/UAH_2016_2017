tablero=[['L','O','B','O'],[],[],[],[]]
palabras=['LOBO','NUTRIA,','TIGRE','LEON']
def buscar(tablero,palabras,posx,posy):
      palabra=''
      for x in range(posx,len(tablero[0])):
            palabra+=tablero[posy][x]
            if palabra in palabras:
                  resultado=[True,palabra]
            else:
                  resultado=[False,palabra]
      return resultado
resultado=buscar(tablero,palabras,int(input('X')),int(input('Y')))
if resultado[0]:
      print('Hay palabra: ,',resultado[1])
else:
      print('No hay palabra')
      print(resultado[1])
