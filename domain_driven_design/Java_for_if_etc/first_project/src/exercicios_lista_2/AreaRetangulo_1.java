package exercicios_lista_2;

import java.util.Scanner;

public class AreaRetangulo_1 {
	
	public static void main (String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
        System.out.println("### Calculadora área retangulo ###");
        
        System.out.print("Digite a base do retangulo:");
        
        double base = stdin.nextDouble();
        
        System.out.print("Digite a altura do retangulo:");
        
        double altura = stdin.nextDouble();
        
        double area = base * altura;
        
        System.out.printf("Altura(%.2f) x Base(%.2f) = Area(%.2f)", altura,base,area);
        stdin.close();	
        
	}
	
}
