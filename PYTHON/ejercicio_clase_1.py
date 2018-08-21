personal=[]
lista=['Enero: ','Febrero: ','Marzo: ','Abril: ','Mayo: ','Junio: ','Julio: ','Agosto: ','Septiembre: ','Octubre: ','Noviembre: ','Diciembre: ']
class empleado:
      def __init__(self,nom,suel):
            self.nombre=nom
            self.sueldo=suel
def añadir (lista,personal):
      nombre=input('Introduzca el nombre del empleado: ')
      sueldos=[]
      for i in lista:
            texto=str('Introduzca el sueldo de '+nombre+' para el mes de '+i)
            sueldos.append(seleccion(999999999999,texto))
      personal.append(empleado(nombre,sueldos))
      return personal
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
def visualizar(personal,lista):
      print('***************************************************************************************************************************************************************************************')
      for i in range(len(personal)):
            print(i+1,'.',personal[i].nombre,end='==> ')
            for j in range(len(lista)):
                  print(lista[j],personal[i].sueldo[j],end=' | ')
            print('')
      print('***************************************************************************************************************************************************************************************')
def sueldo_mes(personal,lista):
      resultado=[]
      for i in range(len(personal)):
            print(i+1,'.',personal[i].nombre)
      x=seleccion(len(personal),'¿De quien quiere ver el sueldo mensual?')
      for i in range(len(lista)):
            print(i+1,'.',lista[i])
      y=seleccion(12,'¿De qué mes?')
      if y==13:
            print
      elif 1<=y<=12:
            resultado.append(lista[y-1])
            resultado.append(personal[x-1].sueldo[y-1])
      return resultado
def sueldo_anual(personal,lista):
      suma=0
      for i in range(len(personal)):
            print(i+1,'.',personal[i].nombre)
      x=seleccion(len(personal),'¿De quién quiere ver el sueldo anual?')
      for j in personal[x-1].sueldo:
            suma+=j
      return suma
def sueldo_max(personal,lista):
      maximo=0
      for i in range(len(personal)):
            print(i+1,'.',personal[i].nombre)
      x=seleccion(len(personal),'¿De quien quieres ver el sueldo máximo?: ')
      for j in personal[x-1].sueldo:
            if j>maximo:
                  maximo=j
      return maximo
control_main=True
while control_main:
      print('***************************************************************************************************************************************************************************************')
      print('1. Añadir un nuevo empleado')
      print('2. Visualizar todos los datos')
      print('3. Consultar el sueldo mensual de un empleado')
      print('4. Consultar el sueldo anual de un empleado')
      print('5 Consultar sueldo máximo de un empleado')
      print('6. Salir')
      print('***************************************************************************************************************************************************************************************')
      x=seleccion(6,'¿Qué desea hacer?')
      if x==1: personal=añadir(lista,personal)
      elif x==6:control_main=False
      elif len(personal)!=0:
            if x==2: visualizar(personal,lista)
            elif x==3: print(sueldo_mes(personal,lista))
            elif x==4: print(sueldo_anual(personal,lista))
            elif x==5: print(sueldo_max(personal,lista))
      else:
            print('Introduzca algún empleado para continuar')
            personal=añadir(lista,personal)
            if x==2: visualizar(personal,lista)
            elif x==3: print(sueldo_mes(personal,lista))
            elif x==4: print(sueldo_anual(personal,lista))
            elif x==5: print(sueldo_max(personal,lista))
      
      
