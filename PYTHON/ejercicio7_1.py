class fecha():
      def __init__(self,_dia,_mes,_anno):
            self.dia=_dia
            self.mes=_mes
            self.anno=_anno
def rellenar(nfechas):
      lfechas=[]
      for i in range(nfechas):
            dia=int(input('Introduce el dia: '))
            mes=int(input('Introduce el mes: '))
            anno=int(input('Introduce el año: '))
            lfechas.append(fecha(dia,mes,anno))
      return lfechas
def burbuja(lfechas):
      for pasada in range(len(lfechas)-1,0,-1):
            for i in range(pasada):
                  if lfechas[i].dia>lfechas[i+1].dia:
                        temp=lfechas[i]
                        lfechas[i]=lfechas[i+1]
                        lfechas[i+1]=temp
def ordenar(lfechas):
      burbuja(lfechas)
      for i in range (len(lfechas)):
            print('Fecha',i+1)
            print('     Dia: ',lfechas[i].dia)
            print('     Mes: ',lfechas[i].mes)
            print('     Año: ',lfechas[i].anno)
def buscar(lfechas,dia):
      centro=len(lfechas)//2
      if dia==lfechas[centro].dia:
            pos=centro
      elif len(lfechas)>1:
            if dia>lfechas[centro].dia:
                  pos=buscar(lfechas[centro+1:len(lfechas)],dia)
            else:
                  pos=buscar(lfechas[0:centro],dia)
      else:
            pos=-1
      return pos
nfechas=int(input('Introduce el numero de fechas: '))
lfechas=rellenar(nfechas)
ordenar(lfechas)
dia=int(input('Introduce el dia de la fecha a buscar: '))
print('La fecha buscada, se encuentra en la posicion', buscar(lfechas,dia))

