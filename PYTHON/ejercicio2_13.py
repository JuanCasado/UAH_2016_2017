def distancia (x,y,z,a,b,c):
    """OBJ: calcular la distancia entre dos puntos en el espacio
    float,float,float,float,float,float-->float
    """
    return ((x - a)**2+(y - b)**2+(z - c)**2)**(1/2)
while True:
    print('Escriba las cordenadas de cada punto cuando se le soliciten')
    x=float(input('Introduzca la coordenada x del primer punto: '))
    y=float(input('Introduzca la coordenada y del primer punto: '))
    z=float(input('Introduzca la coordenada z del primer punto: '))
    a=float(input('Introduzca la coordenada x del segundo punto: '))
    b=float(input('Introduzca la coordenada y del segundo punto: '))
    c=float(input('Introduzca la coordenada z del segundo punto: '))
    print(x)
    print(y)
    print(z)
    print(a)
    print(b)
    print(c)
    distancias=distancia(x,y,z,a,b,c)
    print('')
    print('************************************************************************')
    print('La distancia entre ambos puntos es: ', distancias)
    print('************************************************************************')
    print('')
    print('¿Desea calcular otra distancia?')
    seleccion=input('Escriba quit para salir, pulse enter para calcular otra distancia_')
    print('')
    print('')
    if seleccion == 'quit':
        break
