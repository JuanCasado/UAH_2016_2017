class fecha():
      def __init__(self,_dia,_mes,_anno):
            self.dia=_dia
            self.mes=_mes
            self.anno=_anno
def dato (texto):
      '''str-->int
      OBJ:devuelve un entero positivo'''
      control_dato=True
      while control_dato:
            try:
                  x=int(input(texto))
                  if x>=0:
                        control_dato=False
                  else:
                        print('Caracter inválido')
            except:
                  print('Caracter inválido')
      return x
def pedir_fecha():
      '''void-->reg
      OBJ: da una fecha'''
      return fecha(dato('Intruduzca el día'),dato('Introduzca el mes'),dato('Introduzca el año'))
def fechas_persona():
      '''void-->list
      OBJ: a una persona se le asignan 3 fechas'''
      control=True
      persona=[]
      print('Fecha de nacimiento')
      persona.append(pedir_fecha())
      print('Fecha de matrimonio')
      persona.append(pedir_fecha())
      while control:
            if validar(persona):
                  print('Fecha de defunción')
                  persona.append(pedir_fecha())
                  while control:
                        if validar(persona):
                              control=False
                        else:
                              print('Datos inválidos')
                              print('Fecha de defunción')
                              persona[2]=pedir_fecha()
            else:
                  print('Datos inválidos')
                  print('Fecha de matrimonio')
                  persona[1]=pedir_fecha()
      return persona
def validar(persona):
      '''list-->boolean
      OBJ: comprueba que las fechas sean correctas'''
      validacion=[]
      for x in persona:
            validacion.append(x.dia+x.mes*100+x.anno*10000)
      if len(validacion)==3:
            if validacion[0]<validacion[1]<validacion[2]:
                  resultado=True
            else:
                  resultado=False
      elif len(validacion)==2:
            if validacion[0]<validacion[1]:
                  resultado=True
            else:
                  resultado=False
      return resultado
while True:
      fechas=fechas_persona()
      for x,y in zip(fechas,['Nacimiento: ','Boda: ','Muerte: ',]):
            print(y,x.dia,'/',x.mes,'/',x.anno)
