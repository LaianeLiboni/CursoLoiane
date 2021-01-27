package Exercicios2;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
		double horas = scanner.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O salário bruto é de: " + salarioBruto);
		System.out.println("O INSS é de: " + inss);
		System.out.println("O valor do sindicato é de: " + sindicato);
		System.out.println("O valor do Imposto de Renda é de: " + ir);
		System.out.println("O valor do salário Líquido é de: " + salarioLiquido);
	}
}