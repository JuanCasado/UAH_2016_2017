def multiplicacion (num1,num2):
      '''int,int-->int
      OBJ: multiplicar de forma recursiva'''
      menor=min(num1,num2)
      mayor=max(num1,num2)
      if menor==1:
            resultado=mayor
      else:
            resultado=mayor+multiplicacion(mayor,menor-1)
      return resultado
while True:
      num1=int(input('Numero 1: '))
      num2=int(input('Numero 2: '))
      print(multiplicacion(num1,num2))
