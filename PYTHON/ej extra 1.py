def suma_raices(n):
      '''int-->int
      OBJ: suma las raices de los numeros menores al introducio incluido
      PRE:n>=0'''
      if n==0:
            resultado=0
      elif n==1:
            resultado=1
      else:
            resultado=((n)**(1/2))+suma_raices(n-1)
      return resultado
print(suma_raices(int(input('Numero: '))))
