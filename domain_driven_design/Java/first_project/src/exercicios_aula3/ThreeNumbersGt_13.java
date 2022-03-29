package exercicios_aula3;

import java.util.Scanner;

public class ThreeNumbersGt_13 {
        
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		int numeros[] = new int[3];
		
		for (int i=0; i < 3;i++) {
			
			System.out.println("Digite um numero:");
			
			numeros[i] = stdin.nextInt();
		
		}
			
		if (numeros[0] > numeros[2] && numeros[0] > numeros[3]) {
			System.out.printf("%d é o maior.",numeros[0]);
		}
		
		else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
			System.out.printf("%d é o maior.",numeros[1]);
		}
		
		else if (numeros[2] > numeros[0] && numeros[2] > numeros[1]) {
			System.out.printf("%d é o maior.",numeros[2]);
		}
		else {
			System.out.print("Os numeros são iguais.");
		}
		
		stdin.close();		
		
	}
}
