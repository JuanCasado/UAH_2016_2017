#perimetro
def perimetro (x,y):
    """float,float->float
    OBJ: Calculare el perímetro de un rectángulo
     float,float>0"""
    return x*2+y*2
#perimetro
def area (x,y):
    """float,float->float
    OBJ: Calculare el área de un rectángulo
    float,float>0"""
    return x*y
while True:
     #pide datos
    lado=float(input('Introduce el lado del rectángulo_ '))
    altura=float(input('Introduce la altura del rectángulo_ '))
    #muestra resultados
    print ('El perímetro es: ', perimetro(lado,altura))
    print('El area es:', area(lado,altura))
    print('Pulse intro para calcular en otro rectángulo')
    #para calcular más o salir
    prueba=input('Escriba x para salir_ ')
    if prueba == 'x':
        break

