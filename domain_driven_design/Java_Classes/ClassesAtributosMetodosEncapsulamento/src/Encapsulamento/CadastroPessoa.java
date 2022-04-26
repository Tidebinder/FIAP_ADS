package Encapsulamento;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CadastroPessoa {
	
	
	
	public static void main (String args[]) {
		
		ArrayList<Pessoa> lista_pessoas = new ArrayList<Pessoa>();		
		
		boolean adicionar = true;
		
		Scanner stdin = new Scanner(System.in);
		
		int id = 1;
		
		while (adicionar) {
			
			Pessoa p = new Pessoa();
			
			System.out.print("Digite o nome do úsuario:");
			
			String nome = stdin.next();
			
			p.setName(nome);
			p.setId(id);
			
			lista_pessoas.add(p);
			
			id ++;
			
			System.out.print("Quer criar outro úsuario(S/N):");
			
			char sim_nao = stdin.next().charAt(0);
			
			if (sim_nao == 'S') {
				
				System.out.println("Úsuario adicionado");
				
			}
			else {
				System.out.println("Úsuario adicionado");
				System.out.println("Finalizando...");
				adicionar = false;
			}
			
	
		}
		
		for(int i=0;i < lista_pessoas.size();i++) {
			Pessoa pessoa = lista_pessoas.get(i);
		
			System.out.printf("O ID do usúario %s é %d\n",pessoa.getName(),pessoa.getId());
		}
		
		
		stdin.close();
	}
}

