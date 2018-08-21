def suma(m1,m2):
      '''list,list-->list
      OBJ:suma dos matrices
      Pre:matrices del mismop tamaño'''
      suma=[]
      for i,j in zip(m1,m2):
            parcial=[]
            for x,y in zip(i,j):
                  parcial.append(x+y)
            suma.append(parcial)
      return suma
def totalizar(x):
      totalizada=[]
      for a in range(len(x[0])):
            totalizada.append(0)
      for j in range(len(x[0])):
            for i in range (len(x)):
                  totalizada[j]+=x[i][j]
      return totalizada
print(totalizar(suma([[1,2],[1,2]],[[2,2],[3,3]])))
