import math
coeficiente_1 = int(input('Digite o primeiro coeficiente da equação de segundo grau:'))
coeficiente_2 = int(input('Digite o segundo coeficiente da equação de segundo grau:'))
coeficiente_3 = int(input('Digite o terceiro coeficiente da equação de segundo grau:'))

if coeficiente_1 == 0:
    print("O primeiro coeficiente não pode ser zero, tente novamente.")
    exit()

delta = coeficiente_2**2 - 4 * coeficiente_1 * coeficiente_3

if delta < 0:
    print("Equação não possui raizes reais.")
    exit()



raiz_1 = (coeficiente_2 * -1 + math.sqrt(delta)) / 2 * coeficiente_1

raiz_2 = (coeficiente_2 * -1 - math.sqrt(delta)) / 2 * coeficiente_1


print(f"x' =  {raiz_1}\nx'' = {raiz_2}")
