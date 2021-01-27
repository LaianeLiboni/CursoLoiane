package Exercicios2;

import java.util.Scanner;

public class Numeros2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entre com um outro número inteiro: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Entre com um número real: ");
		double num3 = scanner.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * num3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
	}
}
