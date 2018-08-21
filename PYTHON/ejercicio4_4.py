import random
def lista_aleatoria():
      '''empty==>list
      OBJ: da una lista de longitud aleatoria entre 1, 20 de valores aleatorios 1,20'''
      lista=[]
      for i in range(random.randrange(1,21)):
            lista.append(random.randrange(1,21))
      return lista
def media_lista(lista):
      suma=0
      for i in range(len(lista)):
            suma+=lista[i]
      media=suma/len(lista)
      return media
def extremos_lista(lista):
      lista.sort()
      menor=lista[0]
      lista.reverse()
      mayor=lista[0]
      return menor,mayor
lista=lista_aleatoria()
print('La media es: ',media_lista(lista),'; y los extremos son: ',extremos_lista(lista))
