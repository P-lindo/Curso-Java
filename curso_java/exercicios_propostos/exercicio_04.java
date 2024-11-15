package curso_java.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	
		
		System.out.printf("Insira seu número, horas trabalhadas, valor recebido por hora %n");
		
		double N = sc.nextDouble();
		double T = sc.nextDouble();
		double H = sc.nextDouble();
		
		double salario =  ((T * H) * 30);
		
		System.out.printf("Número Funcionário = %.2f%n Salário Funcionário = %.2f%n", N, salario);
		
		sc.close();
	}

}
