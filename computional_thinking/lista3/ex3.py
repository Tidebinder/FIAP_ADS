time_1_nome = str(input("Digite o nome do primeiro time:"))
time_1_gols = int(input("Quantos gols eles fizeram:"))
time_2_nome = str(input("Digite o nome do segundo time:"))
time_2_gols = int(input("Quantos gols eles fizeram:"))

if time_1_gols > time_2_gols:
    print(f"{time_1_nome} GANHOU !!!!!")
elif time_1_gols == time_2_gols:
    print("EMPATEEEEE!!!!")
else:
    print(f"{time_2_nome} GANHOU !!!!!")