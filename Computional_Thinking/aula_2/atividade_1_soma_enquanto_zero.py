lista_numeros = []

print("Programa para adicionar todos os numeros inputados pelo úsuario até encontrarmos um zero")

continuar = True

while continuar:

    numero = int(input("Digite um numero para adicionarmos:"))
    lista_numeros.append(numero)
    more = str(input("Quer adicionar mais um(S/N):")).upper()
 
    if more == "N":
       continuar = False    

resultado = 0
lista_str = []
for number in lista_numeros:

    if number != 0:
        lista_str.append(str(number))
        resultado += number
    else:
        break
        
print(f"Os numeros escolhidos foram:{','.join(lista_str)}\nO resultado foi: {resultado}")
