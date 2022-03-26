from calendar import monthrange

mes_dias_uteis = monthrange(2022,int(input("Digite o mês em numeral:")))[1] - 8

horas_trabalhadas = int(input("Digite quantas horas você trabalhou nesse mês:"))

salario_hora = float(input("Digite quanto você ganha por hora:"))

horas_extras = horas_trabalhadas / mes_dias_uteis

if horas_extras > 8:

    salario = horas_trabalhadas * salario_hora
    ganho_extra = horas_extras * (salario_hora * 50 / 100) 
    print(f"Você ganha {salario} e vai receber R${round(ganho_extra,2)} de horas extras, no total vc vai ganhar {round(salario + ganho_extra,2)}")

else:
    salario = salario_hora * horas_trabalhadas
    print(f"Você só trabalhou 8 horas por dia, seu salário será de R${salario}")



