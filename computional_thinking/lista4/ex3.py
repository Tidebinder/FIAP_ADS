numero_alunos = int(input("Digite quantos alunos tem na sala:"))


nota_alunos = []
alunos_acima_media = []
alunos_abaixo_media = []
for i in range(1,numero_alunos+1):
    nota = int(input(f"Digite a nota do aluno nº {i}:"))
    nota_alunos.append(nota)
    if nota < 5:
        alunos_abaixo_media.append(nota)
    else:
        alunos_acima_media.append(nota)



media = sum(nota_alunos) / numero_alunos


print(f"A media dos alunos foi de {media}")

print(f"{len(alunos_acima_media)} tiraram nota a cima da media, {len(alunos_abaixo_media)} tiraram nota abaixo da media.")

