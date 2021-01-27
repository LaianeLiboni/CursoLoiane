package Exercicios2;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Farenheit: ");
		double f = scanner.nextDouble();
		
		double C = (5 * (f - 32) / 9);
		
		System.out.println("A temperatura em Celsius é: " + C);
	}

}
