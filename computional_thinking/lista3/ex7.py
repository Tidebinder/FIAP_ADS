idade_nadador = int(input("Digite a idade do nadador:"))

if idade_nadador >= 5 and idade_nadador <= 7:
    print("O nadador é da categoria infantil.")
elif idade_nadador >= 9 and idade_nadador <= 10:
    print("O nadador é da categoria juvenil.")
elif idade_nadador >= 11 and idade_nadador <= 15:
    print("O nadador é da categoria adolescente.")
elif idade_nadador >= 16 and idade_nadador <= 30:
    print("O nadador é da categoria adulto.")
elif idade_nadador >= 30:
    print("O nadador é da categoria senior.")
else:
    print("O nadador é um nenê ele não pode nadar.")
