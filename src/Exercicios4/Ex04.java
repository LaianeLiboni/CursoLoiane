package Exercicios4;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		
		boolean valido = false;
		do {
		
			System.out.println("Entre com a popula��o A:");
			popA = scanner.nextDouble();
			
			if (popA > 0) {
				valido = true;
			}else {
				System.out.println("Popula��o A precisa ser maior que 0.");
			}
			
		}while(!valido);
		
		
		valido = false;
		do {
		
			System.out.println("Entre com a popula��o B:");
			popB = scanner.nextDouble();
			
			if (popB > 0) {
				valido = true;
			}else {
				System.out.println("Popula��o B precisa ser maior que 0.");
			}
			
		}while(!valido);
				
		valido = false;
		do {
		
			System.out.println("Entre com a  taxa de crescimento da popula��o A:");
			taxaA = scanner.nextDouble();
			
			if (taxaA > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento da popula��o A precisa ser maior que 0.");
			}
			
		}while(!valido);
		
		valido = false;
		do {
		
			System.out.println("Entre com a  taxa de crescimento da popula��o B:");
			taxaB = scanner.nextDouble();
			
			if (taxaB > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento da popula��o B precisa ser maior que 0.");
			}
		}while(!valido);
		
		int cont = 0;
			
		while (popA < popB) {
			
			popA += (popA / 100) * taxaA;
			popB += (popB / 100) * taxaB;
			cont++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantos anos: " + cont);
	}
		
}

