#4inaRow
#Mr.BlissfulGrin
from random import choice
tablero=[]
mapa=[]
def pedir_numero(texto):
  '''str-->int
  OBJ: pide un entero entre 1y7 y devulve uno menos del recibido'''
  control_pedir_numero=True
  while control_pedir_numero:
    resultado=input(texto)
    try:
      resultado=int(resultado)
      if 0<resultado<8:
        resultado-=1
        control_pedir_numero=False
      else:
        print('Wrong character')
        print('Enter a number between 1 and 7')
    except:
      print('Wrong character')
      print('Enter a number between 1 and 7')
  return resultado
def pedir_numero_2(texto):
  '''str-->int
  OBJ: pide un entero entre 1y3 y devulve uno menos del recibido'''
  control_pedir_numero=True
  while control_pedir_numero:
    resultado=input(texto)
    try:
      resultado=int(resultado)
      if 0<resultado<4:
        resultado-=1
        control_pedir_numero=False
      else:
        print('Wrong character')
        print('Enter a number between 1 and 7')
    except:
      print('Wrong character')
      print('Enter a number between 1 and 7')
  return resultado
def crear_tablero():
  '''void-->void
  OBJ: crea el tablero de juego y el mapa de calor'''
  for x in range(7):
    parcial=[]
    parcial_mapa=[]
    for y in range(7):
      parcial.append('_')
      parcial_mapa.append(0)
    tablero.append(parcial)
    mapa.append(parcial_mapa)
def vaciar_tablero():
  '''void-->void
  OBJ: modifica la lista tablero y la pone a 0'''
  for x in range(7):
    for y in range(7):
      tablero[x][y]='_'
      mapa[x][y]=0
def vaciar_mapa():
  for x in range(7):
    for y in range(7):
      mapa[x][y]=0
def mostrar_tablero():
  '''void-->void
  OBJ: muestra el tablero de juego'''
  print('*****************************************************************************************************************')
  print('                                     ***********************')
  print('                                     **** 1 2 3 4 5 6 7 ****')
  for x in range(7):
    print('                                     ****',end=' ')
    for y in range(7):
      print(tablero[x][y],end=' ')
    #for j in range(7): print(mapa[x][j],end=' ')###########################################################################
    print('****')
  print('                                     **** 1 2 3 4 5 6 7 ****')
  print('                                     ***********************')
  print('*****************************************************************************************************************')
def poner_ficha(ficha):
  '''void-->void
  OBJ: permite al usuario poner una ficha en el tablero'''
  control_poner_ficha=True
  while control_poner_ficha:
    columna=pedir_numero('Columna = ')
    x=6
    while x>=0:
      if tablero[x][columna]=='_':
        tablero[x][columna]=ficha
        control_poner_ficha=False
        x=0
      elif x==0:
        print('The column is full')
      x-=1
def poner_ficha_maquina(columna,clave):
    x=6
    while x>=0:
      if tablero[x][columna]=='_':
        tablero[x][columna]=clave
        x=0
      x-=1
def ganador(clave):
  '''str-->bool
  OBJ: Dice si hay cuatro en raya o no'''
  return vertical(clave)or horizontal(clave)or derecha(clave)or izquierda(clave)
def vertical(clave):
  '''str-->bool
  OBJ:mira si se ha ganado en vertical y genera el mapa de calor vertical'''
  ganador=False
  y=6
  while ((y>=0) and not(ganador)):
    x=6
    while ((x>=0) and not(ganador)):
      if tablero[x][y]!=('_'):
        if x-1>=0:
          if tablero[x][y]==tablero[x-1][y]==clave:
            if x-2>=0:
              if tablero[x-2][y]==tablero[x-1][y]==tablero[x][y]==clave:
                if x-3>=0:
                  if tablero[x-3][y]=='_':
                   mapa[x-3][y]=clave
                  if tablero[x-3][y]==tablero[x-2][y]==tablero[x-1][y]==tablero[x][y]==clave:
                    ganador=True
                  else:
                    x-=1
                else:
                  x-=1
              else:
                x-=1
            else:
              x-=1
          else:
            x-=1
        else:
          x-=1
      else:
        x-=1
    y-=1
  return ganador
def horizontal(clave):
  '''str-->bool
  OBJ:mira si se ha ganado en horizontal y genera el mapa de calor horizontal'''
  ganador=False
  x=6
  while ((x>=0) and not(ganador)):
    y=0
    while ((y<7) and not(ganador)):
      if tablero[x][y]!=('_'):
        if y+1<7:
          if ((tablero[x][y+1]==tablero[x][y]==clave)):
            if y+2<7:
              if ((tablero[x][y+2]==tablero[x][y+1]==tablero[x][y]==clave)):
                if y+3<7 or y-1>=0:
                  if y+3<7:
                    if tablero[x][y+3]=='_':
                      mapa[x][y+3]=clave
                  if y-1>=0:
                    if tablero[x][y-1]=='_':
                      mapa[x][y-1]=clave
                  if y+3<7:
                    if tablero[x][y+3]==tablero[x][y+2]==tablero[x][y+1]==tablero[x][y]==clave:
                      ganador=True
                    else:
                      y+=1
                  else:
                    y+=1
                else:
                  y+=1
              elif y+3<7:
                if((tablero[x][y+2]=='_')and (tablero[x][y+1]==tablero[x][y]==tablero[x][y+3])and (tablero[x][y+1]==clave)):
                  mapa[x][y+2]=clave
                  y+=1
                else:
                  y+=1
              else:
                y+=1
            else:
              y+=1
          elif tablero[x][y+1]=='_':
            if y+3<7:
              if ((tablero[x][y+3]==tablero[x][y+2]==tablero[x][y]) and (tablero[x][y+2]==clave)):
                mapa[x][y+1]=clave
                y+=1
              else:
                y+=1
            else:
              y+=1
          else:
            y+=1
        else:
          y+=1
      elif y+4<7:
        if (tablero[x][y+1]==tablero[x][y+3]==clave)and(tablero[x][y]==tablero[x][y+2]==tablero[x][y+4]=='_'):
          if x==6:
            mapa[x][y+2]=clave
            y+=1 
          elif x+1<7:
            if(tablero[x+1][y]!='_')and(tablero[x+1][y+2]!='_')and(tablero[x+1][y+4]!='_'):
              mapa[x][y+2]=clave
              y+=1
            else:
              y+=1
          else:
            y+=1
        elif(tablero[x][y+1]==tablero[x][y+2]==clave)and(tablero[x][y]==tablero[x][y+3]=='_'):
          if x==6:
            mapa[x][y+choice([0,3])]=clave
            y+=1     
          elif (x+1<7 and y-1>=0 and y+4<7):
            if(tablero[x+1][y]!='_')and(tablero[x+1][y+3]!='_')and(tablero[x+1][y-1]!='_')and(tablero[x+1][y+4]!='_'):
              mapa[x][y+choice([0,3])]=clave
              y+=1
            else:
              y+=1
          else:
            y+=1
        else:
          y+=1
      else:
        y+=1
    x-=1        
  return ganador
def derecha(clave):
  ganador=False
  soportex=6
  soportey=7
  while (soportex>=0 or soportey<7)and(not(ganador)):
    if soportey==0:
      soportex-=1
      x=soportex
      y=0
      if soportex<0:
        soportey=8
    if soportey!=0:
      soportey-=1
      y=soportey
      x=soportex
    while (y<=6 and x>=0)and(not(ganador)):
      if tablero[x][y]!=('_'):
        if x-1>=0 and y+1<=6:
          if tablero[x][y]==tablero[x-1][y+1]==clave:
            if x-2>=0 and y+2<=6:
              if tablero[x][y]==tablero[x-1][y+1]==tablero[x-2][y+2]==clave:
                if (x-3>=0 and y+3<=6)or (x+1<7 and y-1>=0):
                  if x-3>=0 and y+3<=6:
                    if tablero[x-3][y+3]=='_':
                      mapa[x-3][y+3]=clave
                  if x+1<7 and y-1>=0: 
                    if tablero[x+1][y-1]=='_':
                      mapa[x+1][y-1]=clave
                  if x+3<7 and y-3>=0:      
                    if tablero[x-3][y+3]=='_':
                      if tablero[x][y]==tablero[x-1][y+1]==tablero[x-2][y+2]==tablero[x-3][y+3]==clave:
                        ganador=True
                      else:
                        x-=1
                        y+=1
                    else:
                      x-=1
                      y+=1     
                  else:
                    x-=1
                    y+=1
                else:
                  x-=1
                  y+=1
              elif x-3>=0 and y+3<=6:
                if (tablero[x][y]==tablero[x-1][y+1]==tablero[x-3][y+3]==clave)and (tablero[x-2][y+2]=='_'):
                  mapa[x-2][y+2]=clave
                  x-=1
                  y+=1
                else:
                  x-=1
                  y+=1
              else:
                x-=1
                y+=1
            else:
              x-=1
              y+=1
          elif x-3>=0 and y+3<=6:
            if (tablero[x][y]==tablero[x-2][y+2]==tablero[x-3][y+3]==clave)and (tablero[x-1][y+1]=='_'):
              mapa[x-1][y+1]=clave
              x-=1
              y+=1
            else:
              x-=1
              y+=1
          else:
            x-=1
            y+=1
        else:
          x-=1
          y+=1
      else:
        x-=1
        y+=1
  return ganador
def izquierda(clave):
  ganador=False
  soportex=6
  soportey=-1
  while (soportex>=0 or soportey<7)and(not(ganador)):
    if soportey==6:
      soportex-=1
      x=soportex
      y=6
      if soportex<0:
        soportey=7
    if soportey!=6:
      soportey+=1
      y=soportey
      x=soportex
    while (y>=0 and x>=0)and(not(ganador)):
      if tablero[x][y]!=('_'):
        if x-1>=0 and y-1>=0:
          if tablero[x][y]==tablero[x-1][y-1]==clave:
            if x-2>=0 and y-2>=0:
              if tablero[x][y]==tablero[x-1][y-1]==tablero[x-2][y-2]==clave:
                if (x-3>=0 and y-3>=0)or(x+1<7 and y+1<7):
                  if x-3>=0 and y-3>=0:
                    if tablero[x-3][y-3]=='_':
                      mapa[x-3][y-3]=clave
                  if x+1<7 and y+1<7:
                    if tablero[x+1][y+1]=='_':
                      mapa[x+1][y+1]=clave
                  if x-3>=0 and y-3>=0:
                    if tablero[x][y]==tablero[x-1][y-1]==tablero[x-2][y-2]==tablero[x-3][y-3]==clave:
                      ganador=True
                    else:
                      x-=1
                      y-=1
                  else:
                    x-=1
                    y-=1
                if x+1<7 and y+1<7:
                  if tablero[x+1][y+1]=='_':
                    mapa[x+1][y+1]=clave
                  else:
                    x-=1
                    y-=1
                else:
                  x-=1
                  y-=1
              elif x-3>=0 and y-3>=0:
                if (tablero[x][y]==tablero[x-1][y-1]==tablero[x-3][y-3]==clave)and (tablero[x-2][y-2]=='_'):
                  mapa[x-2][y-2]=clave
                  x-=1
                  y-=1
                else:
                  x-=1
                  y-=1
              else:
                x-=1
                y-=1
            else:
              x-=1
              y-=1
          elif x-3>=0 and y-3>=0:
            if (tablero[x][y]==tablero[x-2][y-2]==tablero[x-3][y-3]==clave)and (tablero[x-1][y-1]=='_'):
              mapa[x-1][y-1]=clave
              x-=1
              y-=1
            else:
              x-=1
              y-=1
          else:
            x-=1
            y-=1
        else:
          x-=1
          y-=1
      else:
        x-=1
        y-=1
  return ganador
def onevsone():
  '''void-->void
  OBJ:permite jugar a dos personas entre si'''
  clave='x'
  crear_tablero()
  vaciar_tablero()
  mostrar_tablero()
  while not(ganador('x')or ganador('o')):
    print('Turno de ',clave)
    poner_ficha(clave)
    #vaciar_mapa()##########################################################################################################
    #ganador('x')###########################################################################################################
    #ganador('o')###########################################################################################################
    mostrar_tablero()
    if clave =='x':
      clave='o'
    elif clave =='o':
      clave='x'
  if clave =='x':
    clave='o'
  elif clave =='o':
    clave='x'
  print('*****************************************************************************************************************')
  print('                                       ',clave,'WON!!!!!')
  print('*****************************************************************************************************************')
  vaciar_tablero()
def juego():
  print('Choose token (x starts):')
  print('1. x')
  print('2. o')
  print('3. Aleatorio')
  seleccion=pedir_numero_2('==>')
  if seleccion==0:
    ganador=ia('x')
  elif seleccion==1:
    ganador=ia('o')
  elif seleccion==2:
    ganador=ia(choice(['x','o']))
  print('*****************************************************************************************************************')
  print('                                        ',ganador,'WON!!!!!')
  print('*****************************************************************************************************************')
def ia(clave):
  consigna=clave
  crear_tablero()
  mostrar_tablero()
  while(not(ganador('x') or ganador('o'))):
    if clave==consigna:
      poner_ficha(clave)
    else:
      poner_ficha_maquina(choice([0,1,2,3,4,5,6,]), clave)
    vaciar_mapa()
    ganador('x')
    ganador('o')
    mostrar_tablero()
    if clave =='x':
      clave='o'
    elif clave =='o':
      clave='x'
  if clave =='x':
    clave='o'
  elif clave =='o':
    clave='x'
  return clave
control_main=True
print('*****************************************************************************************************************')
print('Welcome to:')
print('*****************************************************************************************************************')
print('   **     **     ********  ****      **           ****            *******      *******   **    **    **    **')
print('   **     **        **     ** **     **          **  **           **    **    **     **   **    **  **    **')
print('   **     **        **     **  **    **         **    **          **    **   **       **   **    ****    **')
print('   *********        **     **   **   **        **      **         *******    **       **    **    **    **')
print('          **        **     **    **  **       ************        ****       **       **     **  ****  **')
print('          **        **     **     ** **      **          **       **  **      **     **       ****  ****')
print('          **     ********  **      ****     **            **      **    **     *******         **    **')
print('*****************************************************************************************************************')
print('                                                                               By: Mr.BlissfulGrin')
print('')
while control_main:
  print('Choose game mode:')
  print('1. U vs Ia')
  print('2. 1 vs 1')
  print('3. Exit')
  seleccion=pedir_numero_2('==>')
  if seleccion==0:
    juego() 
  elif seleccion==1:
    onevsone()
  elif seleccion==2:
    print('Thak you for playing')
    input('Press enter to exit')
    control_main=False