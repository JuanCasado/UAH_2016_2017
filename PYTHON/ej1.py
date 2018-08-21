productos=[]
cestas=[]
class fecha:
      def __init__(self,Dia,Mes,Anno):
            self.dia=Dia
            self.mes=Mes
            self.anno=Anno
def add_producto(productos):
      '''list-->list
      OBJ:permite añadir un producto nuevo'''
      productos.append([input('Introduzca el noimbre del artículo'),int(input('Introduzca el precio del artículo precio')),fecha(int(input('Introduzca el día de caducidad')),int(input('Introduzca el mes de caducidad')),int(input('Introduzca el año de caducidad')))])
      return productos
def add_cesta(productos,cestas):
      '''list,list-->list
      OBJ:Permite crear una cesta nueva con los productos que se tienen'''
      cestas=[]
      cesta=[]
      for i in range(len(productos)):
            print(i+1,'. ',productos[i][0])    
      numero=int(input('Cuantos articulos quiere en su cesta'))
      for i in range(numero):
            articulo=int(input('Qué artículo quiere añadir a la cesta'))
            cesta.append(productos[articulo-1])
      cestas.append(cesta)
      return cestas
def precio_cesta(productos,cestas):
      '''list,list-->int
      OBJ: da el precio de una cesta'''
      for i in range(len(cestas)):
            print('cesta', i+1)
      cesta=int(input('De qué cesta quiere saber el precuio?'))
      precio=0
      for x in cestas[cesta-1]:
            for j in productos:
                  if j[0]==x:
                        precio+=j[1]
      return precio
def caducidad(productos):
      '''list-->list
      OBJ: dice los productos que caducan antes del 31/1/2017'''
      caducan=[]
      for x in productos:
            if x[2].anno<2017:
                  caducan.append(x[0])
            elif annos==2017:
                  if x[2].mes==1:
                        if x[2].dia<31:
                             caducan.append(x[0])
      return caducan
productos=add_producto(productos)
cestas=add_cesta(productos,cestas)
print(precio_cesta(productos,cestas))
print(caducidad(productos))
                  
      
