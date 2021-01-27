package Exercicios3;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F ou M): ");
		String input = scanner.next();
		
		if (input.equalsIgnoreCase("f")){
			System.out.println("F - feminino ");
		}else if(input.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");			
		} else {
			System.out.println("Sexo inválido");
		}
	}
}
