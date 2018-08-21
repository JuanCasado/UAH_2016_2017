class alumno():
      def __init__(self,nombre,edad,titulacion):
            self.nombre=nombre
            self.edad=edad
            self.titulacion=titulacion
def suma_edades(lista):
      '''list-->int
      suma los datos de una lista de forma recursiva'''
      if len(lista)==1:
            resultado=lista[0].edad
      else:
            resultado=lista[0].edad+suma_edades(lista[1:])
      return resultado
while True:
      numAlumnos=int(input('Introduzca el numero de alumnos'))
      lista=[]
      for x in range(numAlumnos):
            nombre=input('Introduzca el nombre del alumno'+str(x+1)+': ')
            edad=int(input('Introduzca la edad del alumno'+str(x+1)+': '))
            titulacion=input('Introduzca la titulacion del alumno'+str(x+1)+': ')
            lista.append(alumno(nombre,edad,titulacion))
      print(suma_edades(lista))
