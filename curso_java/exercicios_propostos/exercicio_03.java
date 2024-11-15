package curso_java.exercicios_propostos;

import java.util.Scanner;

public class exercicio_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Insira quatro valores: %n");

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		System.out.printf("Valores inseridos: %d, %d, %d, %d.%n", A, B, C, D);

		int diferenca = ((A * B) - (C * D));

		System.out.printf("Diferença = %d", diferenca);

		sc.close();
	}

}
