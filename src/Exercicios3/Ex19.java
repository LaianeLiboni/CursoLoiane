package Exercicios3;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre como primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Entre como segundo número: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Entre com a operação (+ - / * ): ");
		String operacao = scanner.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
			case "+": resultado = num1 + num2; break;
			case "-": resultado = num1 - num2; break;
			case "/": resultado = num1 / num2; break;
			case "*": resultado = num1 * num2; break;
			default : System.out.println("Operacao inválida"); valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
			}
		}
		if (resultado % 2 == 0) {
			System.out.println("Resultado par");
		}else {
			System.out.println("Resultado impar");
		}
		
	}

}
