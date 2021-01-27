package Exercicios4;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean infoValidas = false;		
		String nomeUser;
		String senha;
		
		do {
		
		System.out.println("Entre com o nome do usuário: ");
		nomeUser = scanner.next();
		
		System.out.println("Entre com a senha: ");
		senha = scanner.next();
		
		if (nomeUser.equalsIgnoreCase(senha)) {
			System.out.println("Senha igual a usuário, digite novamente");
		}else {
			infoValidas = true;
			System.out.println("Senha e usuários validos.");
		}
		} while (!infoValidas);
	}

}
