package exercicios_lista_3;

import java.util.Scanner;

public class NumGt_8 {
      public static void main (String args[]) {
    	  
    	  Scanner stdin = new Scanner(System.in);
    	  
    	  System.out.print("Digite o primeiro numero:");
    	  
    	  double numero_1 = stdin.nextDouble();
    	  
    	  System.out.print("Digite o segundo numero:");
    	  
    	  double numero_2 = stdin.nextDouble(); 
    	  
    	  
    	  if (numero_1 > numero_2) {
    		  System.out.printf("O numero %.0f é maior que %.0f",numero_1,numero_2);
    	  }
    	  else if (numero_1 == numero_2) {
    		  System.out.printf("O numero %.0f é igual que %.0f", numero_1,numero_2);
    	  } else {
    		  System.out.printf("O numero %.0f é maior que %.0f", numero_2,numero_1);
    	  }
    	  
    	  stdin.close();      
    	  
      }
}
