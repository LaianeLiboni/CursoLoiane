package Exercicios3;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Entre com o terceiro n�mero: ");
		int num3 = scanner.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O n�mero 1 � maior: " + num1);
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O n�mero 2 � maior: " + num2);
		}else if (num3 >= num1 && num3 >= num2) {
			System.out.println("O n�mero 3 � maior: " + num3);
		}
	}
}
