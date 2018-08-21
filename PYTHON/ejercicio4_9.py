def vocales(x):
      return (('a' in x) and ('e' in x) and ('i' in x) and ('o' in x) and ('u' in x))
def vocales_extra (x):
      return vocales(x) and x.count('a')==1 and x.count('e')==1 and x.count('i')==1 and x.count('o')==1 and x.count('u')==1
x=list(input('Escriba su palabra: '))
print('Estan todas las vocales: ',vocales(x),'; estan solo una vez: ',vocales_extra(x))
