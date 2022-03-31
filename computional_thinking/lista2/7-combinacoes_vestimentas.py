tipos_roupa = ["camisas","calças","sapatos"]

quantidades_roupa = []
for roupa in tipos_roupa:
    
    quantidade = int(input(f"Digite a quantidade de {roupa} que você possui:"))
    
    quantidades_roupa.append(quantidade)

combinacoes = 1 
for quantidade in quantidades_roupa:
    
    combinacoes *= quantidade
    
print(f"A quantidade de combinações de roupas é:{combinacoes}")