package Exercicios3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("O num1 � maior: " + num1);
		}else {
			System.out.println("O num2 � maior: " + num2);
		}
	}
}
