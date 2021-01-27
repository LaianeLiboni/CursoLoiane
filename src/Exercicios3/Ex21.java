package Exercicios3;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros vendidos: ");
		double litros = scanner.nextDouble();
		
		System.out.println("Entre com o tipo de combustível: ");
		String tipo = scanner.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDesconto = 3;
			}else {
				percDesconto = 5;
			}
			total = litros * precoAlc;
						
		}else if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				percDesconto = 4;
			}else {
				percDesconto = 6;
			}
			total = litros * precoGas;
		}
		totalDesconto = (total / 100) * percDesconto;
		
		double precoApagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoApagar);
		

	}

}
