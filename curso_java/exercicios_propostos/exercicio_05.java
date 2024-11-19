package curso_java.exercicios_propostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;

		Object abacaxi;

		List<Object> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add("4");
		list.add(5);
		list.add(6);
		Integer maca;

		for (Object o : list) {
			
			abacaxi = o;
			
			try {
 o=null;
				int b = ((Integer) o) + 10;

				System.out.println("ABACAXI " + abacaxi);

			} catch (ClassCastException e) {
				
				System.out.println("OCORREU UM ERRO AO FAZER CAST...");
				System.out.println(Integer.valueOf((String) abacaxi) + 10);
			}catch (NullPointerException e) {
				
				System.out.println("OCORREU UM ERRO NULL POINT....");
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("OCORREU UM ERRO INESPERADO....");
				System.out.println(Integer.valueOf((String) abacaxi) + 10);
			}
		}
		System.out.println("COONTINUA");

		/*
		 * cod1 = sc.nextInt(); qte1 = sc.nextInt(); preco1 = sc.nextDouble();
		 * 
		 * cod2 = sc.nextInt(); qte2 = sc.nextInt(); preco2 = sc.nextDouble();
		 * 
		 * total = preco1 * qte1 + preco2 * qte2;
		 * 
		 * //System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		 * 
		 * sc.close();
		 */

	}

}
