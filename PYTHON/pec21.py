import random
def sorteo ():
      ganador=[]
      for x in range (6):
            x=random.randrange(0,50)
            if x not in ganador:
                  ganador.append(x)
            else:x-=1
      return ganador
def apuesta():
      boleto=[]
      for x in range(8):
            parcial=[]
            for y in range(6):
                  y=random.randrange(1,50)
                  if y not in parcial:
                        parcial.append(y)
                  else:y-=1
            burbuja(parcial)
            boleto.append(parcial)
      return boleto
def burbuja(x):
      for pasada in range(0,len(x)-1):
            ascender(x,pasada,len(x)-1)
def ascender(x,inicio,fin):
      for i in range(fin,inicio,-1):
            if x[i]<x[i-1]:
                  temp=x[i]
                  x[i]=x[i-1]
                  x[i-1]=temp
def buscar(lista,elem):
      centro=(len(lista)//2)
      if lista[centro]==elem:
            pos=centro
      else:
            if(len(lista)==1):
                  pos=-1
            elif (elem<lista[centro]):
                  pos=buscar(lista[:centro],elem)
            else:
                  pos=buscar(lista[centro+1:],elem)
                  pos+=centro+1
      return pos
while True:
      fallos=[]
      for x in range(8):
            fallos.append(0)
      ganador=sorteo()
      boleto=apuesta()
      print(ganador)
      print(boleto)
      for i in boleto:
            x=0
            for j in ganador:
                  if buscar(i,j)==-1:
                        fallos[x]+=1
            x+=1
      ganar=False
      aciertos=0
      for i in fallos:
            if i<=2:
                  ganar=True
                  aciertos=8-i
      if ganar:
            print('Tiene una apuesta con ',aciertos,'aciertos')
      else:
            print('No ha ganado')
      input('')
