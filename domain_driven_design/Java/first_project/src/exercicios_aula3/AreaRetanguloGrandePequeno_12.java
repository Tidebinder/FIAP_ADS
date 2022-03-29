package exercicios_aula3;

import java.util.Scanner;

public class AreaRetanguloGrandePequeno_12 {
	
		public static void main (String args[]) {
				
				Scanner stdin = new Scanner(System.in);
				
		        System.out.println("### Calculadora área retangulo ###");
		        
		        System.out.print("Digite a base do retangulo:");
		        
		        double base = stdin.nextDouble();
		        
		        System.out.print("Digite a altura do retangulo:");
		        
		        double altura = stdin.nextDouble();
		        
		        double area = base * altura;
		        
		        System.out.printf("Altura(%.2f) x Base(%.2f) = Area(%.2f)", altura,base,area);
		        
		        if (area >= 100) {
		        	System.out.print("\nTerreno grandão heim...");
		        }
		        else {
		        	System.out.print("\nTerreno mixuruca heim...");
		        }
		        stdin.close();	
		        
		       }
}
