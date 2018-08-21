def seleccion(maximo,texto):
      '''int,str==>int
      OBJ:retorna un numero entre 1 y maximo'''
      control_seleccion=True
      while control_seleccion:
            try:
                  x=int(input(texto))
                  if 1<=x<=maximo:
                        control_seleccion=False
                  else:
                        print('Valor incorrecto')
            except:
                  print('Valor incorrecto')
      return x
def matriz():
      '''void==>list
      OBJ: añade una matriz nueva al listado'''
      matriz=[]
      filas=seleccion(99,'Introduzca el número de filas: ')
      columnas=seleccion(99,'Introduzca el número de columnas: ')
      for x in range(filas):
            fila=[]
            for i in range(columnas):
                  fila.append(seleccion(99,'Rellene la matriz: '))
            matriz.append(fila)
      return matriz
def operar(lista):
      '''list==>list
      OBJ: actua como menú para que el usuario realice las operaciones'''
      print('**********************************************************************')
      print('1 . Suma')
      print('2 . Resta')
      print('3 . Multiplicación por constante')
      print('4 . Multiplicación por matriz')
      print('**********************************************************************')
      x=seleccion(4,'¿Qué desea hacer?')
      if x==1:resultado=suma(lista)
      if x==2:resultado=resta(lista)
      if x==3:resultado=multiplicacion_constante(lista)
      if x==4:resultado=multiplicacion_matriz(lista)
      return resultado
def suma(lista):
      '''list==>list
      OBJ:suma x matrices'''
      suma=[]
      resultado=[]
      parcial=[]
      #Muestra el listado de matrices
      print('**********************************************************************')
      for matriz in range(len(lista)):
            print(matriz+1,'.',end=' ')
            for fila in range(len(lista[matriz])):
                  if fila==0:print(lista[matriz][fila])
                  else: print('    ',lista[matriz][fila])
      print('**********************************************************************')
      #Seleccion de matrices
      x=seleccion(99,'¿Cuantas quiere sumar?')
      for i in range(x):
            suma.append(seleccion(99,'Escoja las matrices que quiere sumar:'))
            if i>0:
                  if len(lista[suma[i]-1])!=len(lista[suma[i-1]-1]):
                        print('No se pueden sumar matrices de distinto tamaño')
                        suma.pop()
                  elif len (lista[suma[i]-1][0])!=len(lista[suma[i-1]-1][0]):
                        print('No se pueden sumar matrices de distinto tamaño')
                        suma.pop()
      #Operaciones
      for i in range(len(lista[suma[0]-1])):
            for j in range(len(lista[suma[0]-1][0])):
                  parcial.append(0)
            resultado.append(parcial)
            parcial=[]
      for i in suma:
            for x in range(len(lista[i-1])):
                  for j in range(len(lista[i-1][x])):
                        resultado[x][j]+= lista[i-1][x][j]
      return resultado

def resta (lista):
      '''list==>list
      OBJ:resta x matrices'''
      suma=[]
      resultado=[]
      parcial=[]
      k=0
      #Muestra mel listado de matrices
      print('**********************************************************************')
      for matriz in range(len(lista)):
            print(matriz+1,'.',end=' ')
            for fila in range(len(lista[matriz])):
                  if fila==0:print(lista[matriz][fila])
                  else: print('    ',lista[matriz][fila])
      print('**********************************************************************')
      #Seleccion de matrices
      x=seleccion(99,'¿Cuantas quiere restar? (La primera tendrá signo positivo y el resto negativo: ')
      for i in range(x):
            suma.append(seleccion(99,'Escoja las matrices que quiere restar:'))
            if i>0:
                  if len(lista[suma[i]-1])!=len(lista[suma[i-1]-1]):
                        print('No se pueden restar matrices de distinto tamaño')
                        suma.pop()
                  elif len (lista[suma[i]-1][0])!=len(lista[suma[i-1]-1][0]):
                        print('No se pueden restar matrices de distinto tamaño')
                        suma.pop()
      #Operar
      for i in range(len(lista[suma[0]-1])):
            for j in range(len(lista[suma[0]-1][0])):
                  parcial.append(0)
            resultado.append(parcial)
            parcial=[]
      for i in suma:
            k+=1
            if k==1:
                  for x in range(len(lista[i-1])):
                        for j in range(len(lista[i-1][x])):
                              resultado[x][j]+= lista[i-1][x][j]
            else:
                  for x in range(len(lista[i-1])):
                        for j in range(len(lista[i-1][x])):
                              resultado[x][j]-= lista[i-1][x][j]
      return resultado

def multiplicacion_constante(lista):
      '''list==>list
      OBJ:multiplica una matriz por x constantes'''
      constantes=[]
      resultado=[]
      parcial=[]
      v=0
      #Muestra el listado de matrices
      print('**********************************************************************')
      for matriz in range(len(lista)):
            print(matriz+1,'.',end=' ')
            for fila in range(len(lista[matriz])):
                  if fila==0:print(lista[matriz][fila])
                  else: print('    ',lista[matriz][fila])
      print('**********************************************************************')
      x=(seleccion(99,'Escoja la matriz que quiere multiplicar: '))
      y=(seleccion(99,'¿Por cuantas constantes quiere multiplicar?: '))
      for i in range (y):
            constantes.append(seleccion(99,'Introduzca constante: '))
      #Opera
      for i in range(len(lista[x-1])):
            for j in range(len(lista[x-1][0])):
                  parcial.append(0)
            resultado.append(parcial)
            parcial=[]
      for c in constantes:
            v+=1
            for k in range(len(lista[x-1])):
                  for j in range(len(lista[x-1][k])):
                        if v==1:
                              resultado[k][j]= (lista[x-1][k][j])*c
                        else:
                              resultado[k][j]=resultado[k][j]*c
      return resultado

def multiplicacion_matriz(lista):
      '''list==>list
      OBJ:multiplica x matrices'''
      mult=[]
      resultado=[]
      parcial=[]
      k=0
       #Muestra el listado de matrices
      print('**********************************************************************')
      for matriz in range(len(lista)):
            print(matriz+1,'.',end=' ')
            for fila in range(len(lista[matriz])):
                  if fila==0:print(lista[matriz][fila])
                  else: print('    ',lista[matriz][fila])
      print('**********************************************************************')
      #Selecciona matrices
      p=(seleccion(99,'¿Cuántas matrices quiere multiplicar?: '))
      for i in range(p):
            mult.append(seleccion(99,'Escoja las matrices que quiere multiplicar:'))
            if i>0:
                  if len(lista[mult[i]-1][0])!=len(lista[mult[i-1]-1]):
                        print('No se pueden multiplicar matrices de esos tamaños')
                        mult.pop()
      #Operar
      for w in range(p):
            if w==1:
                  for h in range(len(lista[mult[0]-1])):
                        for j in range(len(lista[mult[1]-1][0])):
                              for x in range(len(lista[mult[0]-1][0])):
                                    k+=lista[mult[0]-1][j][x]*lista[mult[1]-1][x][j]
                              parcial.append(k)
                              k=0
                        resultado.append(parcial)
                        parcial=[]
            elif w>1:
                  resultado1=resultado[:]
                  for h in range(len(resultado1)):
                        for j in range(len(lista[mult[w]-1][0])):
                              for x in range(len(resultado1[0])):
                                    k+=resultado1[j][x]*lista[mult[w]-1][x][j]
                              parcial.append(k)
                              k=0
                        resultado[h]=parcial
                        parcial=[]
      return resultado
            
lista=[]
control_main=True
while control_main:
      print('**********************************************************************')
      print('1 . Nueva matriz')
      print('2 . Operar')
      print('3 . Salir')
      print('**********************************************************************')
      x=seleccion(3,'¿Qué desea hacer?')
      if x==1:lista.append(matriz())
      if x==2:
            if len(lista)!=0:
                  resultado=operar(lista)
                  lista.append(resultado)
                  for fila in range(len(resultado)):
                        print(resultado[fila])
            else:
                  print('Introduzca algunas matrices antes de operar')
      if x==3:control_main=False
      
      
