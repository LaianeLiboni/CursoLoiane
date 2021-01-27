package Exercicios2;

import java.util.Scanner;

public class Temperatura2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius: ");
		double c = scanner.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + f);
	}

}