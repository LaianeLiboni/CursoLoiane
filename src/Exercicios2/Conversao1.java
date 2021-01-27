package Exercicios2;

import java.util.Scanner;

public class Conversao1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros = scanner.nextDouble();
		
		//1 m = 100 cm
		double cm = metros * 100;
		
		System.out.println(metros + " m é igual a " + cm + " cm");
		}
}
