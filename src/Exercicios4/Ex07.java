package Exercicios4;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num;
		double media;
		int soma = 0;
		
			for (int i = 0; i < 5 ; i++) {
				
				System.out.println("Digite um n�mero: ");
				num = scanner.nextInt();
				
				soma += num;
			}
			media = soma / 5;
				
			System.out.println("Soma: " + soma);
			System.out.println("M�dia: " + media);
	}
}
