package exercicio_lista_4;

import java.util.Scanner;

public class ex21_dowhile {
public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		int numero;
		
		 System.out.print("Digite um numero positivo:");
			
		numero = stdin.nextInt();
		
		do {
			
			System.out.println("ERRO, numero não positivo.");
			
		    System.out.print("Digite novamente:");
			
			numero = stdin.nextInt();
		}
		while (numero<=0); 
			
			
		System.out.print("Parabens você sabe oque é um numero positivo");
		
	}
}
