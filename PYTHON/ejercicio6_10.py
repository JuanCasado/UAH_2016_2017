def cambio_base(numero,base):
      if numero<base:
            resultado=numero
      else:
            resultado=numero%base+10*cambio_base(numero//base,base)
      return resultado
while True:
      print(cambio_base(int(input('Numero: ')),int(input('Base: '))))
                          
