package exercicios_lista_2;

import java.util.Scanner;

public class AreaQuadrado_2 {

	public static void main (String args[]){
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o valor da aresta do quadrado: ");
		
		float aresta = stdin.nextFloat();
		
	    double area = Math.pow(aresta, 2) ;
	    
	    System.out.printf("A aresta é %.2f portanto %.2f² = %.2f",aresta,aresta,area);
	    
	    stdin.close();		
	}
}
