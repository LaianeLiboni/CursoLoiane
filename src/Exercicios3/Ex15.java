package Exercicios3;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o lado 1: ");
		int lado1 = scanner.nextInt();
		
		System.out.println("Digite o lado 2: ");
		int lado2 = scanner.nextInt();
		
		System.out.println("Digite o lado 3: ");
		int lado3 = scanner.nextInt();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)){
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Isósceles");
			}
			
		}else {
			System.out.println("não forma um triângulo");
		}
	}
}