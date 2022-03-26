numero = int(input("Digite um numero:"))
numero_2 = int(input("Digite outro numero:"))


if numero > numero_2:
   print(f"{numero} é maior que {numero_2}")
elif numero == numero_2:
    print(f"Os numeros {numero} e {numero_2} são iguais")
else:
    print(f"{numero_2} é maior que {numero}")