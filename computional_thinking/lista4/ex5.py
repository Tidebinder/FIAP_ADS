numero = int(input("Digite um numero:"))

fator = 2

fatores = []

while numero != 1:

    while numero % fator == 0:
        numero = numero / fator
        fatores.append(fator)
    fator += 1

lista_fatores_quantidade = []

print(lista_fatores_quantidade)
