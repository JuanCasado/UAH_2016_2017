def es_palindromo (palabra):
    resultado=True
    mitad=len(palabra)//2
    for i in range(mitad):
        if palabra[i]==palabra[len(palabra)-1-i]:
            resultado=True
        else: resultado=False
    return resultado
palabra=list(input('Introduce una palabra'))
print(es_palindromo(palabra))
