package Exercicios4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = scanner.next();
			
			if (nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa no m�nimo de 3 caracteres.");
			}
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com a idade:");
			idade = scanner.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
		}while (!infoValida);
			
			infoValida = false;
		do {
			System.out.println("Entre com o sal�rio:");
			salario = scanner.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			}else {
				System.out.println("Sal�rio tem que ser maior que 0.");
			}
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com o sexo:");
			sexo = scanner.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
		}while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com o estado civil:");
			estadoCivil = scanner.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
			}
		}while (!infoValida);
		
		System.out.println("As seguintes informa��es foram coletadas: ");		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}

}
