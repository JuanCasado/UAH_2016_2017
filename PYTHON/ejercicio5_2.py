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
def calcular_datos():
      '''void-->float
      OBJ: calcula la media DE EDAD DE 10 personas'''
      suma=0
      suma_m=0
      contador_m=0
      suma_f=0
      contador_f=0
      contador_f_edad=0
      contador_m_edad=0
      m_joven=0
      f_joven=0
      for x in range(10):
            i=introducir_datos()
            suma+=i.edad
            if i.sexo=='M':
                  suma_m+=i.edad
                  contador_m+=1
                  if contador_m==1:
                        m_joven=i.edad
                  else:
                        if m_joven>i.edad:
                              m_joven=i.edad
                  if i.edad<20:
                        contador_m_edad+=1
            elif i.sexo=='F':
                  suma_f+=i.edad
                  contador_f+=1
                  if contador_f==1:
                        f_joven=i.edad
                  else:
                        if f_joven>i.edad:
                              f_joven=i.edad
                  if 13<=i.edad<=16:
                        contador_f_edad+=1
      media=suma/10
      media_m=suma_m/contador_m
      media_f=suma_f/contador_f
      return media,media_m,media_f,contador_m_edad,contador_f_edad,m_joven,f_joven
a,b,c,d,e,f,g=calcular_datos()
print('Media: ',a)
print('Media (M): ',b)
print('Media (F): ',c)
print('Numero hombres de menos de 20: ',d)
print('Numero mujeres entre 13 y 16: ',e)
print('Hombre más joven: ',f)
print('Mujer más joven: ',g)
      


            
