package exercicios_aula3;

import java.util.Scanner;

public class Velocidade_18 {
    
	public static void main(String args[]) {
		
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite a velocidade inicial em m/s:");
		
		double v_inicial = stdin.nextDouble();
		
		System.out.print("Digite a velocidade da aceleração m/s:");
		
		
		double v_aceleracao = stdin.nextDouble();

		
		System.out.print("Digite o tempo percorrido em segundos:");
		
		double tempo = stdin.nextDouble();
		
		double velocidade = (v_inicial + v_aceleracao * tempo) * 3.6;
		
		if (velocidade <= 40) {
			System.out.print("Devagar");
		}
		
		else if (velocidade <= 60) {
			System.out.print("Velocidade permitida.");
		}
		else if (velocidade <= 80) {
			System.out.print("Velocidade de cruzeiro");
		}
		else if (velocidade <=120) {
			System.out.print("Veiculo rapido");
		}
		else {
			System.out.print("Veiculo muito rapido");
		}
		
		
	}
}
