package exercicio_lista_4;

import java.util.Scanner;

public class ex21_for {

	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite um número positivo:");
		
		int numero = stdin.nextInt();
		
		for(int i=0;i<1;i++) {
			if (numero < 0) {
				System.out.print("ERRO,digite um número positivo:");
				numero = stdin.nextInt();
				i = i -1;
			}
		}
		
	}
}
