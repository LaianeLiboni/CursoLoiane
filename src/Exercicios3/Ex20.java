package Exercicios3;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Telefonou para v�tima?");
		String resp1 = scanner.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = scanner.next();
		
		System.out.println("Mora perto da v�tima?");
		String resp3 = scanner.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String resp4 = scanner.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		}else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice");
		}else if (cont == 5) {
			System.out.println("Assassino");
		}else if (cont == 0) {
			System.out.println("Inocente");
		}
	}
}
