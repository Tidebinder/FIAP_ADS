media_primeiro = float(input("Digite a sua média do primeiro semestre em Computional Thinking:"))
media_segundo = float(input("Digite a sua média do segundo semestre em Computional Thinking:"))
numero_aulas = int(input("Digite quantas aulas teve de Computional Thinking:"))
presenca = int(input("Em quantas dele você esteve presente:"))

media_ano = (media_primeiro * 4 + media_segundo * 6) / 10

presente = presenca / numero_aulas

if media_ano >= 6 and presente >= 70:
    print("Yayy tu passou.")
else:
    print("Tá de DP...")

print(media_ano,presente)