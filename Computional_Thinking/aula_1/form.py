nome = str(input("Digite seu nome:"))
idade = str(input("Digite sua idade:"))
pq_ti = str(input("Por quê escolher Tecnologia da informação:"))
em_ti = str(input("Dentro de TI, já sabe no que você gostaria de trabalhar:"))
hobbies = str(input("Quais são seus hobbies:"))

lista_respostas = [nome,idade,pq_ti,em_ti,hobbies]
with open('form_respostas.txt','w+') as file:

    for resposta in lista_respostas:
        file.write(f"{resposta}\n")
