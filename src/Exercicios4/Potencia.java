package Exercicios4;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Entre com a base: ");
		int base = scanner.nextInt();
				
		System.out.println("Entre com a potência: ");
		int pot = scanner.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i <pot; i++) {
			resultado *= base;
		}
			
		System.out.println("Resutado: " + resultado);
	}

}
