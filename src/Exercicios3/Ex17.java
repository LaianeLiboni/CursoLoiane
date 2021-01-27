package Exercicios3;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o ano: ");		
		int ano = scanner.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("É bissexto");	
	    }else {
	    	System.out.println("Não é bissexto");
	    }
	}
}
