package Exercicios2;

import java.util.Scanner;

public class Soma1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entre com o primeiro número: ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		System.out.println("A soma dos números é: " + soma);
	}
}		
		