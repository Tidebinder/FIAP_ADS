package exercicios_lista_3;

import java.util.Scanner;

public class MediaProva_19 {
	
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite a nota da sua primeira prova:");
		
		int p1 = stdin.nextInt();
		
		System.out.print("Digite a nota da sua segunda prova:");
		
		int p2 = stdin.nextInt();
		
		
		float media = (p1 + 2 * p2) / 3;
		
		if (media >= 5) {
			System.out.print("Parab�ns voc� passou :)");
		}
		else {
			System.out.print("Vish amig�o tu repetiu.");
		}
		
	}

}
