package exercicios_lista_2;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		//Instanciando um objeto da classe scanner.
		Scanner scan = new Scanner(System.in);
		
		//Printando já pulando linha e colocando um \n pra pular outra
		System.out.println("Programa de soma:\n");
		//Printando sem pular linha
		System.out.print("Digite o numero 1:");
		//Pegando o numero que a pessoa digitou usando o Scanner do Java
		int numero1 = scan.nextInt();
		
        System.out.print("Digite o numero 2:");
		
		int numero2 = scan.nextInt();
		//Somando os numeros e jogando na variavel soma
		int soma = numero1 + numero2;
		//Printando a soma.
		System.out.printf("A soma dos numeros é:%s",soma);
		
        scan.close();	
        
	}

}
