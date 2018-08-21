class persona():
      def __init__(self,ns,s,e):
            self.numero=ns
            self.sexo=s
            self.edad=e
def introducir_datos():
      numero=int(input('Introduzca el numero secreto: '))
      sexo=input('Introduzca el sexo: ')
      edad=int(input('Introduzca la edad: '))
      p=persona(numero,sexo,edad)
      return p
def mostrar_datos(p):
      '''p --> void
      OBJ: mostrar por pantalla los datos de una persona'''
      print('******************************************************')
      print('Los datos de la pesona son:')
      print('Numero de secuencia:',p.numero)
      print('Sexo:',p.sexo)
      print('Edad:',p.edad)
      print('******************************************************')
mostrar_datos(introducir_datos())
      
