def barns_m2 (barns):
   '''float --> float
   OBJ: pasar de barns a m2 '''
   return barns*(10**(-28))
def m2_barns (m2):
   """ float --> float
   OBJ: pasar de m2 a barns """
   return m2*10**28
#Menú de selección
while True:
    print('Pulse 1 para pasar de barns a m2')
    print('Pulse 2 para pasar de m2 a barns')
    print('Pulse 3 para cerrar el programa')
    seleccion=input()
    if seleccion == '1' :
        m2=barns_m2(float(input('Introduzca los barns: ')))
        print('')
        print('******************************************************************************************************')
        print('Sus barns equivalen a ', m2, 'm2')
        print('******************************************************************************************************')
        print('')
        
    elif seleccion == '2':
        barns=m2_barns(float(input('Introduzca los m2: ')))
        print('')
        print('******************************************************************************************************')
        print('Sus m2 equivalen a', barns, 'barns')
        print('********************************************')
        print('')
        
    elif seleccion == '3':
        break
    else:
        print('')
        print('******************************************************************************************************')
        print('El valor introducido es erroneo')
        print('******************************************************************************************************')
        print('')
        print('')

    
    
