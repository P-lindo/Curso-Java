package curso_java.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o raio do círculo %n");
		double val1 = sc.nextDouble();
		double val3 = 3.14159;
		
		double area = val3 *  Math.pow(val1, 2);
		
		System.out.printf("O valor da área é %.4f", area);
		
				
		
		
		sc.close();

	}
}