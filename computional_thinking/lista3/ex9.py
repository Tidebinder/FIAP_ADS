def divisao():

    try:

        numero1 = int(input("Digite o dividendo:"))
        numero2 = int(input("Digite o divisor:"))
        print(numero1 / numero2)

    except ZeroDivisionError as err:
        print("Não podemos dividir por zero,tente com outro número")
        divisao()


divisao()