valor_produto = float(input("Digite o valor do produto:"))

try:
    metodo_pagamento = int(input("""\n1. A vista em dinheiro ou cheque\n
2. A vista no cartão de credito\n
3. Em duas vezes\n
4. Quatro vezes\n
Digite o numero da opção:"""))

    if metodo_pagamento > 4 or metodo_pagamento <= 0:
        raise ValueError

except ValueError:
    print("\nEssa não é uma opção valida,tente novamente.")


if metodo_pagamento == 1:
    porcentagem_desconto = 10
    print(f"O desconto será de R${valor_produto * porcentagem_desconto / 100}, você irá pagar R${valor_produto - valor_produto * porcentagem_desconto / 100 }")

elif metodo_pagamento == 2:

    porcentagem_desconto = 5
    print(f"O desconto será de R${valor_produto * porcentagem_desconto / 100}, você irá pagar R${valor_produto - valor_produto * porcentagem_desconto / 100 }")

elif metodo_pagamento == 3:

     print(f"Você não terá desconto, o preço será de:R${valor_produto}")

else:

    juros = 7

    print(f"O juros será de R${valor_produto * juros / 100}, você irá pagar R${valor_produto + valor_produto * juros / 100 }")



