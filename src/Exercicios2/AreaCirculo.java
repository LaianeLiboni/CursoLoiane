package Exercicios2;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o raio do c�rculo: ");
		double raio = scanner.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo �: " + area);
	}
}
