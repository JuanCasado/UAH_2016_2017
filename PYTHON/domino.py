#Mr.BlissfulGrin

                        ########
                        #Dominó.#
                        ########

import random
##########################################################################################################
def inicio_juego():
      '''void==>list,list,list
      OBJ: Crea las fichas necesarias para jugar al dominó y las reparte, 7 al jugador y la máquina'''
      jugador=[]
      maquina=[]
      por_robar=[]
      for i in range(7):
            for j in range(i,7):
                  lista_aux=[]
                  lista_aux.append(i)
                  lista_aux.append(j)
                  por_robar.append(lista_aux)
      for i in range(7):
            ficha=random.randrange(len(por_robar))
            jugador.append(por_robar[ficha])
            por_robar.remove(por_robar[ficha])
            ficha=random.randrange(len(por_robar))
            maquina.append(por_robar[ficha])
            por_robar.remove(por_robar[ficha])
      return por_robar,jugador,maquina
##########################################################################################################
def actualizar(por_robar,jugador,maquina,en_mesa,jugada):
      '''list,list,list,list==>int
      OBJ: Muestra en pantalla el estado del juego y las fichas del jugador y devuelve el numero de jugada'''
      print('***********************************************************************************************')
      print('                                 Jugada:',jugada)
      print('***********************************************************************************************')
      print('Maquina: ',len(maquina),' fichas')
      x=0
      print('0 . Robar (',len(por_robar),')')
      for ficha in jugador:
            x+=1
            print(x,'. Ficha: ',ficha)
      print(len(jugador)+1,'. Pasar turno')
      print('Sobre la mesa: ',en_mesa)
      print('***********************************************************************************************')
      jugada+=1
      return jugada
##########################################################################################################
def jugada_1(jugador,maquina,en_mesa,control_turno_jugador,control_turno_maquina):
      '''list,list,list==>list,list,list
      OBJ: Se realiza la primera jugada es decir se pone sobre la mesa la ficha doble más alta o si no la de más valor numérico'''
      control_jugada_1=True
      x=6
      while control_jugada_1:
            if [x,x] in por_robar:
                  x-=1
            elif x>=0:
                  if [x,x] in jugador:
                        for i in range(2):
                              en_mesa.append(x)
                        print('***********************************************************************************************')
                        print('Has empezado con',[x,x])
                        jugador.remove([x,x])
                        control_turno_maquina=True
                  else:
                        for i in range(2):
                              en_mesa.append(x)
                        print('***********************************************************************************************')
                        print('La maquina ha empezado con',[x,x])
                        maquina.remove([x,x])
                        control_turno_jugador=True
                  control_jugada_1=False
            else:
                  for x in range(6,-1,-1):
                        for y in range(6,-1,-1):
                              if [x,y]not in por_robar:
                                    if [x,y] in jugador:
                                          en_mesa.append(x)
                                          en_mesa.append(y)
                                          print('Has empezado con',[x,y])
                                          jugador.remove([x,y])
                                          x=-2
                                          y=-2
                                    else:
                                          en_mesa.append(x)
                                          en_mesa.append(y)
                                          print('La maquina ha empezado con',[x,y])
                                          maquina.remove([x,y])
                                          x=-2
                                          y=-2
                  control_jugada_1=False
      return jugador,maquina,en_mesa,control_turno_jugador,control_turno_maquina
##########################################################################################################
def seleccion(jugador):
      '''list==>int
      OBJ: toma el número de opciones que tiene el jugador y devuelve la opción elegida'''
      print('¿Qué quiere hacer?')
      control_seleccion=True
      while control_seleccion:
            try:
                  x=int(input(''))
                  if 0<=x<=len(jugador)+1:
                        control_seleccion=False
                  else:
                        print('Opción inválida')
            except:
                  print('Opción inválida')
      return x
##########################################################################################################
def seleccion_2 ():
      '''void==>int
      retorna un entero entre 1 y 2 elegido por el usuario'''
      control_seleccion_2=True
      while control_seleccion_2:
            try:
                  x=int(input(''))
                  if 1<=x<=2:
                        control_seleccion_2=False
                  else:
                        print('Opción inválida')
            except:
                  print('Opción inválida')
      return x
##########################################################################################################
def robar(jugador,por_robar):
      '''list,list==>list,list
      OBJ: da una ficha de las que hay por robar al jugador'''
      ficha=random.randrange(len(por_robar))
      jugador.append(por_robar[ficha])
      por_robar.remove(por_robar[ficha])
      return jugador,por_robar
##########################################################################################################
def movimiento(x,jugador,en_mesa,control_turno_jugador):
      '''int,list,list==>list,list
      OBJ: coloca la ficha seleccionada por el jugador en la mesa'''
      ficha=jugador[x-1]
      if ficha[0]==ficha[1]:
            if ficha[0]==en_mesa[0]:
                  en_mesa[0]=ficha[0]
                  jugador.remove(jugador[x-1])
                  control_turno_jugador=False
            elif ficha[0]==en_mesa[1]:
                  en_mesa[1]=ficha[0]
                  jugador.remove(jugador[x-1])
                  control_turno_jugador=False
      elif (ficha[0]==en_mesa[0] and ficha[1]==en_mesa[1]) or (ficha[1]==en_mesa[0] and ficha[0]==en_mesa[1]):
            print('***********************************************************************************************')
            print('1 . Desea cerrar por',ficha[0],'s')
            print('2 . Desea cerrar por',ficha[1],'s')
            opcion=seleccion_2()
            if opcion==1:
                  if ficha[0]==en_mesa[0]:
                        en_mesa[1]=ficha[0]
                        jugador.remove(jugador[x-1])
                        control_turno_jugador=False
                  elif ficha[0]==en_mesa[1]:
                        en_mesa[0]=ficha[0]
                        jugador.remove(jugador[x-1])
                        control_turno_jugador=False
            elif opcion==2:
                  if ficha[1]==en_mesa[0]:
                        en_mesa[1]=ficha[1]
                        jugador.remove(jugador[x-1])
                        control_turno_jugador=False
                  elif ficha[1]==en_mesa[1]:
                        en_mesa[0]=ficha[1]
                        jugador.remove(jugador[x-1])
                        control_turno_jugador=False
            print('***********************************************************************************************')
      elif ficha[0]==en_mesa[0]:
            en_mesa[0]=ficha[1]
            jugador.remove(jugador[x-1])
            control_turno_jugador=False
      elif ficha[1]==en_mesa[0]:
            en_mesa[0]=ficha[0]
            jugador.remove(jugador[x-1])
            control_turno_jugador=False
      elif ficha[0]==en_mesa[1]:
            en_mesa[1]=ficha[1]
            jugador.remove(jugador[x-1])
            control_turno_jugador=False
      elif ficha[1]==en_mesa[1]:
            en_mesa[1]=ficha[0]
            jugador.remove(jugador[x-1])
            control_turno_jugador=False
      else:
            print('No se puede realizar el movimiento seleccionado, robe ficha o elija uno válido')
            control_turno_jugador=True
      return jugador,en_mesa,control_turno_jugador
##########################################################################################################
def poner_ficha(ficha,en_mesa,contador):
      if ficha[0]==ficha[1]:
            if ficha[0]==en_mesa[0]:
                  en_mesa[0]=ficha[0]
            elif ficha[0]==en_mesa[1]:
                  en_mesa[1]=ficha[0]
      #si cuando solo puede poner una ficha esta es igual a la ficha en la mesa mira que al cerrar pueda seguir poniendo
      elif (ficha[0]==en_mesa[0] and ficha[1]==en_mesa[1]) or (ficha[1]==en_mesa[0] and ficha[0]==en_mesa[1]):
            prueba0=contador[:]
            prueba1=contador[:]
            prueba0[ficha[0]]-=1
            prueba1[ficha[1]]-=1
            if prueba0.count(0)>=prueba1.count(0):
                  if ficha[0]==en_mesa[0]:
                        en_mesa[0]=ficha[1]
                  elif ficha[0]==en_mesa[1]:
                        en_mesa[1]=ficha[1]
            elif prueba0.count(0)<prueba1.count(0):
                  if ficha[1]==en_mesa[0]:
                        en_mesa[0]=ficha[0]
                  elif ficha[1]==en_mesa[1]:
                        en_mesa[1]=ficha[0]
      elif ficha[0]==en_mesa[0]:
            en_mesa[0]=ficha[1]
      elif ficha[1]==en_mesa[0]:
            en_mesa[0]=ficha[0]
      elif ficha[0]==en_mesa[1]:
            en_mesa[1]=ficha[1]
      elif ficha[1]==en_mesa[1]:
            en_mesa[1]=ficha[0]
      return en_mesa
##########################################################################################################
def ia (maquina,en_mesa,por_robar,jugada,jugador,error_fatal):
      '''list,list,list,int===>list,list,list
      OBJ: La maquina hace su movimiento'''
      control_ia=True
      while control_ia:
            posibles=[]
            contador=[]
            for i in range(7):
                  contador.append(0)
            #La maquina reconoce sus fichas
            for ficha in maquina:
                  if ficha[0]==ficha[1]:
                        contador[ficha[0]]+=1
                  else:
                        contador[ficha[0]]+=1
                        contador[ficha[1]]+=1
            #La maquina mira que fichas puede poner
            for mesa in en_mesa:
                  for ficha in maquina:
                        for numero in ficha:
                              if mesa==numero:
                                    posibles.append(ficha)
            if len(posibles)!=0:
                  #Si solo puede poner una la pone
                  #if len(posibles)==1:
                  ficha=posibles[0]
                  print('La maquina ha puesto',ficha)
                  en_mesa=poner_ficha(ficha,en_mesa,contador)
                  maquina.remove(ficha)
                  control_ia=False
                  '''#Si puede poner varias mira con cual se pierde menor variedad de números
                  else:
                        print('Si puede poner varias mira con cual se pierde menor variedad de números')
                        prueba=[]
                        for ficha in posibles:
                              prueba0=contador[:]
                              prueba1=contador[:]
                              prueba0[ficha[0]]-=1
                              prueba1[ficha[1]]-=1
                              prueba.append(prueba0.count(0)+prueba1.count(0))
                        minimo=9999
                        for cuenta in prueba:
                              if cuenta<minimo:
                                    minimo=cuenta
                        print(prueba)
                        print(minimo)
                        if prueba.count(minimo)==1:
                              print('La maquina ha puesto',posibles[prueba.index(minimo)])
                              en_mesa=poner_ficha(posibles[prueba.index(minimo)],en_mesa,contador)
                              maquina.remove(posibles[prueba.index(minimo)])
                              control_ia=False
                        #Si con dos numeros se pierde igual cantidad minima de variedad se intenta cerrar
                        elif prueba.count(minimo)>1:
                              print('Si con dos numeros se pierde igual cantidad minima de variedad se intenta cerrar')
                              opcion=[]
                              prueba1=prueba[:]
                              print(prueba1)
                              while minimo in prueba1:
                                    print(minimo)
                                    opcion.append(posibles[prueba1.index(minimo)])
                                    prueba1[prueba1.index(minimo)]=-1
                              for x in opcion:
                                    intento=poner_ficha(x,en_mesa,contador)
                                    if intento[0]==intento[1]:
                                          print('La maquina ha puesto',opcion[x])
                                          en_mesa=intento
                                          maquina.remove(x)
                                          control_ia=False
                                          x=999
                              #Si no se ha puesto se pone una de las posibles y ya
                              if control_ia:
                                    print('Si no se ha puesto se pone una de las posibles y ya')
                                    print('La maquina ha puesto',posibles[prueba.index(minimo)])
                                    en_mesa=poner_ficha(posibles[prueba.index(minimo)],en_mesa,contador)
                                    maquina.remove(posibles[prueba.index(minimo)])
                                    control_ia=False'''
            #La maquina roba si no puede poner
            else:
                  if len(por_robar)!=0:
                        ficha=random.randrange(len(por_robar))
                        maquina.append(por_robar[ficha])
                        por_robar.remove(por_robar[ficha])
                        jugada-=1
                        print('La maquina ha robado ficha')
                        jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
                  #La maquina no puede poner ni robar
                  else:
                        print('La maquina pasa turno')
                        error_fatal=True
                        control_ia=False
      return maquina,en_mesa,por_robar,error_fatal
##########################################################################################################
control_main=True
while control_main:
      error_fatal=False
      control_turno=True
      control_turno_jugador=False
      control_turno_maquina=False
      jugada=0
      en_mesa=[]
      reinicio=False
      print('***********************************************************************************************')
      print('                                            Bienvenido al juego del dominó')
      print('***********************************************************************************************')
      print('El objetivo del juego es colocar las fichas que se tienen igualando a las que hay sobre la mesa')
      print('Ganará el que antes se quede sin fichas')
      print('La primera ficha en entrar al campo será la de valor más alto de entre las dobles')
      print('Mucha suerte!!!!!!!!!!')
      print('***********************************************************************************************')
      input('Pulse intro para repartir las fichas')
      por_robar,jugador,maquina=inicio_juego()
      jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
      input('Pulse intro para empezar el juego')
      jugador,maquina,en_mesa,control_turno_jugador,control_turno_maquina=jugada_1(jugador,maquina,en_mesa,control_turno_jugador,control_turno_maquina)
      jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
##########################################################################################################
      while control_turno:
            if control_turno_jugador:
                  while control_turno_jugador:
                        x=seleccion(jugador)
                        if x==0:
                              if len(por_robar)!=0:
                                    jugador,por_robar=robar(jugador,por_robar)
                                    jugada-=1
                                    jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
                              else:
                                    print('No se puede robar porque no quedan más fichas, ponga una o pase turno')
                        elif 1<=x<=len(jugador):
                              jugador,en_mesa,control_turno_jugador=movimiento(x,jugador,en_mesa,control_turno_jugador)
                        elif x==len(jugador)+1:
                              if len(por_robar)==0:
                                    control_turno_jugador=False
                              else:
                                    print('No puede pasar turno porque quedan fichas que robar, robe una o ponga una de las que tenga')
                  jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
                  if len(jugador)==0:
                        control_turno_maquina=False
                  else:
                        control_turno_maquina=True
##########################################################################################################
            if control_turno_maquina:
                  maquina,en_mesa,por_robar,error_fatal=ia(maquina,en_mesa,por_robar,jugada,jugador,error_fatal)
                  if not(error_fatal):
                        jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
                        control_turno_maquina=False
                        control_turno_jugador=True
                  elif error_fatal:
                        jugada-=1
                        jugada=actualizar(por_robar,jugador,maquina,en_mesa,jugada)
                        #Que hacer si nadie tiene para seguir poniendo
                        regulador=[]
                        for ficha in jugador:
                              for x in ficha:
                                    for y in en_mesa:
                                          if x==y:
                                                regulador.append(0)
                        if len(regulador)==0:
                              control_turno_maquina=False
                              control_turno_jugador=False
                        else:
                              control_turno_maquina=False
                              control_turno_jugador=True
##########################################################################################################
            if len(jugador)==0:
                  print('***********************************************************************************************')
                  print('                                                    HAS GANADO!!!!!!!!!!!')
                  print('***********************************************************************************************')
                  print('***********************************************************************************************')
                  control_turno=False
            if len(maquina)==0:
                  print('***********************************************************************************************')
                  print('                                                    HAS PERDIDO!!!!!!!!!!!')
                  print('***********************************************************************************************')
                  print('***********************************************************************************************')
                  control_turno=False
            if not(control_turno_maquina) and not(control_turno_jugador) and len(jugador)!=0 and len(maquina)!=0:
                  print('***********************************************************************************************')
                  print('                                                    TABLAS!!!!!!!!!!!')
                  print('***********************************************************************************************')
                  print('***********************************************************************************************')
                  print('            NADIE TIENE FICHAS PARA SGUIR PONIENDO, LA PARTIDA SE REINICIA')
                  print('***********************************************************************************************')
                  print('***********************************************************************************************')
                  reinicio=True
                  control_turno=False
      if not(reinicio):
            print('1 . Volver a jugar')
            print('2 . Salir')
            opcion=seleccion_2()
            if opcion==2:
                  control_main=False
print('***********************************************************************************************')
print('***********************************************************************************************')
print('                                                    GRACIAS POR JUGAR!!!!!!!!!!!')
print('***********************************************************************************************')
print('***********************************************************************************************')
print('Pulse intro para cerrar')
input('')
