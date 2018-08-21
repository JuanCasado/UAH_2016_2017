def suma_pares(n):
      if n<1:
            resultado=0
      else:
            if n%2==1:
                  resultado=0
            if n%2==0:
                  resultado=n+suma_pares(n-2)
      return resultado
while True:
      print(suma_pares(int(input('Numero: '))))
            
