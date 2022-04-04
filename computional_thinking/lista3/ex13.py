mes = int(input("Digite o mês:"))
dia = int(input("Digite o dia:"))

if mes <= 0 or mes > 12 or dia < 0 or dia > 31:
    print("Data invalida")
elif mes == 2 and dia > 28:
    print("Data invalida")
elif dia == 31 and (mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 9 or mes == 11):
    print("Data invalida.")
else:
    print("Data valida.")

