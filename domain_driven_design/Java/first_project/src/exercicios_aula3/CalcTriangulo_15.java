package exercicios_aula3;

import java.util.Scanner;

public class CalcTriangulo_15 {
	
	public static void main (String args[]) {

	 Scanner stdin = new Scanner(System.in);
	 
	 float lados[] = new float[3];
	 
	 
	 for(int i=0;i < 3; i++) {
		 
		 System.out.printf("Digite o tamanho do %dº lado do triangulo:\n",i+1);
		 
		 lados[i] = stdin.nextFloat();
	 }
	
	 if (lados[0] + lados[1] > lados[2] || lados[1] + lados[2] > lados[0] || lados[0] + lados[2] > lados[1]) {
		 
		 if (lados[0] == lados[1] && lados[0] == lados[2] && lados[1] == lados[2]) {
			 System.out.print("Triangulo equilatero");
		 }
		 else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
			 System.out.print("Triangulo escaleno.");
		 }
		 else {
			 System.out.print("Triangulo isosceles.");
		 }
		  
	 }
	 
	 else {
		 
		 System.out.print("Não é um triangulo.");
		 
	 }
		 
	 
	 stdin.close();
	}
	
}
