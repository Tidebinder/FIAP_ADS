package exercicios_lista_2;

import java.util.Scanner;


import java.util.ArrayList;

public class MediaAritmetica_4 {
	
	public static void main (String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		boolean pergunta = true;
		
		ArrayList<Double> numeros = new ArrayList<>();
		
		while (pergunta == true) {
			
			System.out.print("Digite um numero racional para adicionar no calculo da media:");
			
			numeros.add(stdin.nextDouble());
			
			System.out.print("Quer adicionar mais um numero?(S/N):");
			
			char adicionar = stdin.next().charAt(0);
			
			if (adicionar == 'N' && numeros.size() > 0) {
				pergunta = false;
			}
			else if (adicionar == 'N' && numeros.size() < 0) {
				System.out.println("Adicione pelo menos um numero antes de terminar.");
			}
			else {
				pergunta = true;
			}
			
		}
		
		float media = 0;
		
		for(int i=0; i < numeros.size(); i++) {
			
			media += numeros.get(i);
			
		}
		
		float resultado = media / numeros.size();
		
		System.out.printf("O resultado da media é: %.2f",resultado);
	
		stdin.close();
		
	}

}
