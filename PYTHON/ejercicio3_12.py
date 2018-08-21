def mayor(x,i,Nmayor):
      if i==0:
            Nmayor=x
      elif Nmayor<x:
            Nmayor=x
      return Nmayor
def menor (x,i,Nmenor):
      if i==0:
            Nmenor=x
      elif Nmenor>x:
            Nmenor=x
      return Nmenor
def sumatorio (x,i,suma):
      if i==0:
            suma=x
      else:
            suma+=x
      return suma
def pedir_entero():
      control_pedir_entero=True
      while control_pedir_entero:
            try:
                  entero=int(input('Introduzca el numero de números que quiere introducir: '))
                  if entero > 1:
                        control_pedir_entero=False
                  else:
                        print('Cantidad de números invalida')
            except:
                  print('Cantidad de números invalida')
      return entero
def pedir_real(i,veces):
      control_pedir_real=True
      while control_pedir_real:
            try:
                  if i==0:
                        real=float(input('Introduzca el primer número: '))
                  elif veces-i==1:
                        real=float(input('Introduzca el último número: '))
                  else:
                        real=float(input('Introduzca el siguiente número: '))
                  control_pedir_real=False
            except:
                  print('Cantidad de números invalida')
      return real
def media (x,i):
      return x/(i)
control_main=True
el_mayor=-999999999999999
el_menor=999999999999999
el_sumatorio=0
while control_main:
      veces=pedir_entero()
      for i in range(veces):
            numero=pedir_real(i,veces)
            el_mayor=mayor(numero,i,el_mayor)
            el_menor=menor(numero,i,el_menor)
            el_sumatorio=sumatorio(numero,i,el_sumatorio)
            la_media=media(el_sumatorio,i+1)
      print('********************************************************************')
      print('El mayor es: ',el_mayor)
      print('El menor es: ',el_menor)
      print('La media es: ',la_media)
      print('********************************************************************')
            
            
