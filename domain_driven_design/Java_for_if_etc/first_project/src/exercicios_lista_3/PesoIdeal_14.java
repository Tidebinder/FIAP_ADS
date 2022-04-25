package exercicios_lista_3;

import java.util.Scanner;
public class PesoIdeal_14 {
	
	public static void main(String args[]) {
		
          Scanner stdin = new Scanner(System.in);
          
          System.out.println("Digite sua altura:");
          
          float altura = stdin.nextFloat();
          
          System.out.println("Digite seu peso:");
          
          float peso = stdin.nextFloat();
          
          float imc = peso / (altura * altura);
          
          if(imc <= 20) {
        	  System.out.printf("Seu imc é de %.1f, abaixo do peso.",imc);
          }
          else if(imc <= 25) {
        	  System.out.printf("Seu imc é de %.1f, seu peso é normal.",imc);
          }
          else {
        	  System.out.printf("Seu imc é de %.1f, acima do peso.",imc);
          }
          
          stdin.close();
          
	}

}
