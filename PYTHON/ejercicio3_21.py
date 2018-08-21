def peticion(x):
      '''OBJ: pide al usuario un valor de la lista y comprueba que sea un número real mayor que 0
      int==>float'''

      datos=['Introduzca los años trabajados','Introduzca el sueldo mensual','Introduzca los ingresos totales anuales',
      'Introduzca los gastos mensuales que supondría la hipoteca','Introduzca el valor total a pagar por la hipoteca',
      'Introduzca los gastos causados por otros creditos','Introduzca el sueldo anual']
      while True:
            print(datos[x])
            try:
                  y=float(input('_'))
                  if y > 0 :
                          return y
                  else:
                        print('Introduzca un valos correcto')
            except:
                  print('Introduzca un valor correcto')
def es_annos_trabajados(x):
      return x>=5
def es_sueldo_mensual(x,y):
      return x>=(y*0.2)
def es_ingresos(x,y):
      return x>=(y*0.4)
def es_otros (x,y):
      return x>=(y*0.2)
while True:
      if es_annos_trabajados(peticion(0)) and es_sueldo_mensual(peticion(1),peticion(3)) and es_ingresos(peticion(2),peticion(4)) and es_otros(peticion(5),peticion(6)):
            print('La hipoteca es viable')
      else:
            print('La hipoteca no es viable')
      
      
                        

      
      
                  
            
