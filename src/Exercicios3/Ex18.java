package Exercicios3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}
}
