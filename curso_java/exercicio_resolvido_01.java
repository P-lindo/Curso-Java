package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido_01 {

	public static void main(String[] args) {
		// area = largura_x_comprimento
		// preco = area x preco_do_metro_quadrado
		// largura 10, comprimento 30
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		
		
		sc.close();		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
