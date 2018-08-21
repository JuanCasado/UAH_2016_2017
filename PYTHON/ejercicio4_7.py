def escribir_mayuculas (cadena):
    lista=cadena.split()
    for i in range(len(lista)):
        palabra=lista[i]
        letra=str(palabra[0])
        letra=letra.upper()
        palabra_list=list(palabra)
        palabra_list[0]=letra
        lista[i]=palabra_list

    for i in range(len(lista)):
        palabra=lista[i]
        for j in range(len(palabra)):
            print(palabra[j], end='')
        print(' ', end='')
        
escribir_mayuculas(input(''))
   
    
