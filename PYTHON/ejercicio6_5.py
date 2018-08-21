def invertir (palabra):
      if len(palabra)==1:
            resultado=str(palabra[0])
      else:
            resultado=str(str(palabra[len(palabra)-1])+str(invertir(palabra[:len(palabra)-1])))
      return resultado
while True:
      print(invertir(list(input('Palabra: '))))
