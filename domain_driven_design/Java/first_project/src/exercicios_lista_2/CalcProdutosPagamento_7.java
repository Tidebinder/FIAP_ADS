package exercicios_aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcProdutosPagamento_7 {
	public static void main (String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		
		ArrayList<Double> produtos = new ArrayList<>();
		
		int produto_id = 1;
		
		while (produtos.size() < 5) {
			
			System.out.printf("Digite o valor do produto %s:",produto_id);
			
			produtos.add(stdin.nextDouble());
			
			produto_id += 1;
			
		}
		
		float resultado = 0;
		
		for(int i=0; i < produtos.size(); i++) {

			resultado += produtos.get(i);
			
		}
		
		System.out.printf("A soma de todos os produtos �: %.2f",resultado);
		
		stdin.close();	
	}
	
}