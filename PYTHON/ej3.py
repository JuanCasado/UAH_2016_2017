def mostrar_impares(x):
      '''str-->str
      OBJ:devuelve las palabras impares de una cadena en una lista'''
      lista=x.split()
      impares=[]
      for x in range (len(lista)):
            if ((x+1)%2)!=0:
                  impares.append(lista[x])
      return impares
def invertir(x):
      '''list-->str
      OBJ:devuelve una lista invertida en forma de cadena
      PRE:lista no vacia'''
      if len(x)==1:
            return str(x[0])
      else:
            return str(str(invertir(x[1:]))+str(x[0]))
print(invertir(mostrar_impares(input('Introduzca su cadena'))))

                  
