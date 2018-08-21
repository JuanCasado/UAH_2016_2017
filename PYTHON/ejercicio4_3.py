def pedir_lista_enteros():
      '''empty==>lista
      OBJ: pide al usuario 20 numeros enteros y crea una lista'''
      lista=[]
      control_pedir_lista_float=True
      while control_pedir_lista_float:
            try:
                  real=int(input('Introduzca el primer elemento de la lista: '))
                  lista.append(real)
                  for i in range(18):
                        real=int(input('Introduzca el siguiente elemto de la lista: '))
                        lista.append(real)
                  real=int(input('Introduzca el último elemento de la lista: '))
                  lista.append(real)
                  control_pedir_lista_float=False
            except:
                  print('El elemento introducido no es válido por favor vuelva a empezar')
      return lista
def ordenar_lista(lista):
      '''lista==>lista,lista
      OBJ: crea dos listas una ordenada de mayor a menor y otra de menor a mayor
      PRE: la lista deb estar formada por reales al menos'''
      mayor=[]
      menor=[]
      lista.sort()
      for i in range(len(lista)):
            mayor.append(lista[i])
      lista.reverse()
      for i in range(len(lista)):
            menor.append(lista[i])
      return mayor,menor
print(ordenar_lista(pedir_lista_enteros()))
