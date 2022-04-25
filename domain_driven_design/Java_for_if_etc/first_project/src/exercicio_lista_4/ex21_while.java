package exercicio_lista_4;

import java.util.Scanner;

public class ex21_while {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite um numero positivo:");
		
		int numero = stdin.nextInt();
		
		while (numero<=0) {
			System.out.println("ERRO, numero negativo.");
			System.out.print("Digite o numero novamente:");
			numero = stdin.nextInt();
		}
			
		System.out.print("Parabens você sabe oque é um numero positivo");
		
	}
	

}
