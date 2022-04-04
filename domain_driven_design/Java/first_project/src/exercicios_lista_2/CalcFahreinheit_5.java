package exercicios_aula2;

import java.util.Scanner;

public class CalcFahreinheit_5 {
      public static void main(String args[]) {
    	  
    	  Scanner stdin = new Scanner(System.in);
    	  
    	  System.out.print("Digite quantos graus Celsius:");
    	  
    	  double celsius = stdin.nextDouble();
    	  
    	  double resultado = (celsius * 1.8) + 32;
    	  
    	  System.out.printf("Os graus em fahrenheit s�o: %.2f",resultado);
    	  
    	  stdin.close();
      }
}
