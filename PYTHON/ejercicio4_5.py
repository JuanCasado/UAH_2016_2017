import random
def lista_aleatoria():
      '''empty==>list
      OBJ: da una lista de longitud aleatoria entre 1, 100 de valores aleatorios 1,10'''
      lista=[]
      for i in range(random.randrange(1,100)):
            lista.append(random.randrange(1,10))
      return lista
def calificaciones(lista):
      '''list==>list
      OBJ: transorma numeros del 1 al 10 a calificaciones
      PRE: valores de lista del 1 al 10'''
      calificaciones=[]
      for i in range(len(lista)):
            if 0<=lista[i]<5:
                  calificaciones.append('Suspenso')
            if 5<=lista[i]<7:
                  calificaciones.append('Suficiente')
            if 7<=lista[i]<9:
                  calificaciones.append('Notable')
            if 9<=lista[i]<=10:
                  calificaciones.append('Sobresaliente')
      return calificaciones
print(calificaciones(lista_aleatoria()))
