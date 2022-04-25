package exercicios_lista_2;

import java.util.Scanner;


public class CalcCotacaoDolar_6 {
	public static void main(String args[]) {
			
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite quantos reais vale 1 dolar:");
		double cotacao = stdin.nextDouble();	
		System.out.print("Digite quantos dolares:");
		double dolares = stdin.nextDouble();
		double resultado = dolares * cotacao;
				
		System.out.printf("Resultado: %.2f",resultado);
		stdin.close();	
	}
}
