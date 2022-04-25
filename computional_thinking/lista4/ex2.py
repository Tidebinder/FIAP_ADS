numero_alunos = int(input("Digite quantos alunos tem na sala:"))

nota_alunos = []
for i in range(1,numero_alunos+1):
    nota = int(input(f"Digite a nota do aluno nº {i}:"))
    nota_alunos.append(nota)



media = sum(nota_alunos) / numero_alunos

print(f"A media dos alunos foi de {media}")