def funcion_condicional (valor):
    if valor > 0:
        return "Positivo"
    elif valor < 0:
        return "Negativo"
    else:
        return "Cero"
    

resultado_valor = funcion_condicional(0)
print (resultado_valor)
