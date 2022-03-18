
lista_numeros = []

while len(lista_numeros) < 5:

    lista_numeros.append(int(input('Digite um numero:')))



resultado = 0


for numero in lista_numeros:

    resultado += numero


print(f"Os numeros escolhidos foram:{','.join(map(str,lista_numeros))}\nO resultado foi:{resultado}")