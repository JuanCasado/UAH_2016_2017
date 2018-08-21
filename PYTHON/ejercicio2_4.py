def media (x,y,z):
    """OBJ: obtener la media de tres numeros
    float,float,float-->float
    """
    return (x+y+z)/3
def rodear_de_asteriscos (x):
    """OBJ: rodea de asteriscos y muestra en pantalla
    str==>empty"""
    print('')
    print('************************************************************************')
    print(x)
    print('************************************************************************')
    print('')
def quiere_salir ():
    """OBJ: permitir a usuario volver a ejecutar el programa o cerrarlo"""
    seleccion=input('Escriba quit para salir, pulse enter para calcular otra media_')
    print('')
    print('')
    if seleccion == 'quit':
        return True
while True:
    print('Escriba las tres notas cuando se le solociten para poder calcular su media')
    nota1=float(input('Introduzca la primera nota: '))
    nota2=float(input('Introduzca la segunda nota: '))
    nota3=float(input('Introduzca la tercera nota: '))
    medias=str(media(nota1,nota2,nota3))
    rodear_de_asteriscos('La media de las notas es: '+ medias)
    print('¿Desea calcular otra media?')
    if quiere_salir():
        break
