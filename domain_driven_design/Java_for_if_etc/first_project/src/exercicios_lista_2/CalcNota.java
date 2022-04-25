package exercicios_lista_2;

import java.util.Scanner;

public class CalcNota {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		
		String nome = scan.nextLine();
		
		System.out.println("Digite sua nota:");
		
		double nota = scan.nextDouble();
		
		System.out.printf("Seu nome é %s e sua nota é %.2f",nome,nota);
		
		scan.close();		
	}

}
