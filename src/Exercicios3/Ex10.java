package Exercicios3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o turno que voc� estuda: ");
		String turno = scanner.next();
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia"); break;
		case "v":
		case "V": System.out.println("Boa tarde"); break;
		case "n":
		case "N": System.out.println("Boa noite"); break;
		default: System.out.println("Valor inv�lido"); 
		}
	}
}

