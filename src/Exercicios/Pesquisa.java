package Exercicios;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos e se tem bichinho de estima��o");
		String primeiroNome = scanner.next();
		int idade = scanner.nextInt();
		byte qteFilhos = scanner.nextByte();
		boolean temPet = scanner.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Sua idade �: " + idade);
		System.out.println("Quantidade de filhos: " + qteFilhos);
		System.out.println("Tem bichinho de estima��o? " + temPet);

	}

}
