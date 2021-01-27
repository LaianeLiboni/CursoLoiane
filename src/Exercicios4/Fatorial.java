package Exercicios4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
				
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		System.out.println("Resutado: " + fatorial);
	}
}
