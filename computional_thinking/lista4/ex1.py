numero = int(input("Digite um numero:"))
lista_numero = []

while numero != 0:
    lista_numero.append(numero)
    numero = int(input("Digite um numero:"))

soma = sum(lista_numero)

print(f"A soma de todos os numeros inteiros é {soma}")