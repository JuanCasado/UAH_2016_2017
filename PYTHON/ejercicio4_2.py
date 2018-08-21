def es_lista1_mayor(x,y):
	if len(x)>len(y):
	    return True
	else:
	    return False
def suma_listas (x,y):
      if len(x)==len(y):
            
            for i in range (len(x)):
                  lista.append(x[i]+y[i])
            return lista
      else:
            if es_lista1_mayor(x,y):
                  lista=[]
                  for i in range (len(y)):
                        lista.append(x[i]+y[i])
                  for i in range (len(y),len(x)):
                        lista.append(x[i])
                  return lista
            else:
                  lista=[]
                  for i in range (len(x)):
                        lista.append(x[i]+y[i])
                  for i in range(len(x),len(y)):
                      lista.append(y[i])
                  return lista
      		
x=[1,2,3,4,5,6]
y=[1,2,3,4,5]
print(suma_listas (x,y))
