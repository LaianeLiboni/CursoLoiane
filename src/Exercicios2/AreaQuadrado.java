package Exercicios2;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Entre com o tamanho do lado do quadrado: ");
			double lado = scanner.nextDouble();
			
			//area = lado * lado
			double area = Math.pow(lado, 2);
			
			System.out.println("A �rea do quadrado �: " + area);
			System.out.println("O dobro da �rea do quadrado �: " + (area * 2));
	}
}
