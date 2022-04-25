
continuar = True

lista_numeros = []

while continuar:

    
    numeros = int(input("Digite um numero:"))
    lista_numeros.append(numeros)
    
    continuar = True if input("Quer adicionar mais um numero(S/N):").upper() == "S" else False

lista_negativos = [i for i in lista_numeros if i < 0 ]

lista_positivos = [i for i in lista_numeros if i > 0]

print(f"A quantidade de negativos digitado foi: {len(lista_negativos)}\nA quantidade de positivos digitados foi: {len(lista_positivos)}")
