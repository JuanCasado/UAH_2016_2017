a=input('_')
b=int(a)
c=input('_')
d=int(c)
p=True
if len(a)==len(c):
      for i in range (len(a)):
            b=b%10**(len(a)-i)
            d=d//10**i
            if b//10**(len(a)-1)==d%10:
                  p=True
            else:
                  p=False
                  i=999999999999999999999999
else:
      p=False
print(p)
