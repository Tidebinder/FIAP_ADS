package exercicios_lista_2;

import java.util.Scanner;

public class AreaTriangulo_3 {
	
	public static void main (String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("#####Calculadora de área de triangulos#####");
		
		System.out.print("Digite a altura do triangulo: ");
		
		float altura = stdin.nextFloat();
		
		System.out.print("Digite a base do triangulo: ");
		
		float base = stdin.nextFloat();
		
		float area = (base * altura) / 2;
				
		System.out.printf("A altura é %.2f e a base é %.2f, o resultado é: %.2f",altura,base,area);
		stdin.close();	
	}

}
