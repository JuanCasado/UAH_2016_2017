def precioValido ():
      '''OBJ=pide un valor al usuario hasta que sea un real mayor que 0
      empty=>float'''
      control_precioValido=True
      while control_precioValido:
            precio=input('Introduzca el precio de la compra: ')
            try:
                  precio=float(precio)
                  if precio>0:
                        control_precioValido=False
                  else:
                        print('Introduzca un valor válido')
            except:
                  print('Introduzca un valor válido')
      return precio
def es_pagoTarjeta():
      '''OBJ=realiza una pregunta de si o no al usuario
      empty=>boolean'''
      control_pagoTarjeta=True
      while control_pagoTarjeta:
            introducido=input('Introduzca T si el pago es con tarjeta o C si es al contado')
            if introducido =='T':
                  resultado= True
                  control_pagoTarjeta=False
            elif introducido =='C':
                  resultado= False
                  control_pagoTarjeta=False
            else:
                  print('Introduzca un valor válido')
      return resultado

while True:
      precio=precioValido()      
      if precio>100:
            if es_pagoTarjeta():
                  precio=precio-precio*0.02
            else:
                  precio=precio-precio*0.05
      print(precio)
            

