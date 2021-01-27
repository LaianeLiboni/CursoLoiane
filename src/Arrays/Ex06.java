package Arrays;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int []vetorB = new int[vetorA.length];
		double []vetorC = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetorA da posicao: " + i);
			vetorA[i] = scanner.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do vetorB da posicao: " + i);
			vetorB[i] = scanner.nextInt();
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
			
		}			
			
		System.out.print("Vetor A = ");
		for (int i = 0; i  < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i  < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("VetorC = ");
		for (int i = 0; i  < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
	}

}
