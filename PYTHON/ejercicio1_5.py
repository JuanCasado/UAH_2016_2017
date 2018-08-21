def tiempo ():
    """OBJ: obtener el tiempo actual en segundos"""
    import time
    horas=int(time.strftime('%H'))
    minutos=int(time.strftime('%M'))
    segundos=int(time.strftime('%S'))
    return horas*60*60+minutos*60+segundos
def tiempo_hasta_media_noche ():
    """"OBJ: calcular el tiempo hasta la proxima media noche media noche"""
    return 86400-tiempo()
print('Segundos desde la ultima media noche: ', tiempo())
print('Segundos hasta la proxima media nochhe: ', tiempo_hasta_media_noche())
    
