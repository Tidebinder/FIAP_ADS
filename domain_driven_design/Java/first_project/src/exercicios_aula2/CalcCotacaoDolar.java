package exercicios_aula2;

import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class CalcCotacaoDolar {
	public static void main(String args[]) {
			
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite quantos reais vale 1 dolar:");
		double cotacao = stdin.nextDouble();	
		System.out.print("Digite quantos dolares:");
		double dolares = stdin.nextDouble();
		double resultado = dolares * cotacao;
				
		System.out.printf("Resultado: %.2f",resultado);
	}
}
