"""rm = str(input("Digite o número do seu rm:"))

resultado = 0

for i in rm:
    
    resultado += int(i)
    
    
print(resultado)"""

rm = int(input("Digite o número do seu RM:"))

soma = 0

for i in range(0,5):
    
    resto = rm % 10
    soma += resto
    
    rm //= 10
    
    
print(soma)