package curso_java.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num3 = num1 + num2;

		System.out.printf("Valores inseridos: %d e %d.%n", num1, num2);
		System.out.printf("O valor da operação %d + %d = 0 é: %d + %d = %d", num1, num2, num1, num2, num3);

		sc.close();
	}

}
