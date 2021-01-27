package Exercicios3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scanner.nextInt();
		
		if (num >= 0) {
			System.out.println("O número informado é positivo");
		}else {
			System.out.println("O número informado é negativo");
		}
	}
}
