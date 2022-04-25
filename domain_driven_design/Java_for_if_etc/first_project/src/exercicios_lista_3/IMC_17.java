package exercicios_lista_3;

import java.util.Scanner;

public class IMC_17 {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite seu peso:");
		
		double peso = stdin.nextFloat();
		
		System.out.print("Digite sua altura:");
		
		double altura = stdin.nextDouble();
		
		boolean pergunta = true;
		
	    char sexo = 0;
		
		while (pergunta == true) {
			
			System.out.print("Agora digite seu sexo(H/M):");
		
			sexo = stdin.next().charAt(0);
			
			if (sexo == 'H' || sexo == 'M') {
				
				pergunta = false;
					
			}
			
			else {
				System.out.println("Sexo invalido.");
				pergunta = true;
			}
			
		}
		
		double imc = peso / Math.pow(altura, 2);
		
		if (sexo == 'H') {
			
			if (imc < 20) {
				System.out.print("Abaixo do peso.");
			}
			else if (imc <= 25 || imc == 20) {
				System.out.print("Peso normal.");
			}
			else {
				System.out.print("Acima do peso");
			}
			
		}
		
		else if (sexo == 'M') {
			
			if (imc < 19) {
				System.out.print("Abaixo do peso.");
			}
			else if (imc <= 24 || imc == 19) {
				System.out.print("Peso normal.");
			}
			else {
				System.out.print("Acima do peso");
			}
			
		}
		
	    stdin.close();
	}

}
