def contar_digitos(n):
      if n//10==0:
            resultado=1
      else:
            resultado=1+contar_digitos(n//10)
      return resultado
while True:
      print(contar_digitos(int(input('Numero: '))))
