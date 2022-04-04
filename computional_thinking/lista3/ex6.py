numero_1 = int(input("Digite um numero:"))
numero_2 = int(input("Digite outro numero:"))

resto = numero_1 % numero_2

if resto == 0:
    print(f"{numero_1} é divisivel por {numero_2}, o resultado é:{numero_1 / numero_2}")
else:
    print(f"{numero_1} não é disivel por {numero_2}")