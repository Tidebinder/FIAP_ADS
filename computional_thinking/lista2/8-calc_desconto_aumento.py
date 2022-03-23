preco = float(input("Digite o preço do produto:"))

porcentagem = int(input("Digite a porcentagem para calcularmos o desconto e o aumento:"))


print(f"O desconto é de : {(preco * porcentagem) / 100}\nO aumento foi de: {preco * (porcentagem/100 + 1) }")