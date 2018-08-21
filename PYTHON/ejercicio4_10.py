def transformar (palabra):
      for i in range(len(palabra)):
            if palabra[i]=='a':
                  palabra=palabra.replace('a','4')
            elif palabra[i]=='e':
                  palabra=palabra.replace('e','3')          
            elif palabra[i]=='i':
                  palabra=palabra.replace('i','1') 
            elif palabra[i]=='o':
                  palabra=palabra.replace('o','0') 
            elif palabra[i]=='u':
                  palabra=palabra.replace('u','#')
      return palabra
print(transformar(input('Escribe una palabra: ')))
