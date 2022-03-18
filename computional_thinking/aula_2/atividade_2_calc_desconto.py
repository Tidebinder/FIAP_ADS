valor_produto = int(input('Digite o valor do produto:'))
desconto_porcentagem = int(input('Digite a porcentagem de desconto oferecida:'))


resultado =  valor_produto - ((valor_produto * desconto_porcentagem)/100)

print(f"Você vai pagar: {resultado}")


