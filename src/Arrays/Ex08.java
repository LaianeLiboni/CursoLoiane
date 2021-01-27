package Arrays;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scanner.nextInt();
		}
		
		int qtePares = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				qtePares++;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i  < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
			
		System.out.println("Quantidade de números pares: " + qtePares);
	}
}
