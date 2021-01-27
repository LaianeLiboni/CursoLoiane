package Exercicios2;

import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Entre com a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Entre com a quarta nota: ");
		double nota4 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das notas é: " + media);
	}
}	