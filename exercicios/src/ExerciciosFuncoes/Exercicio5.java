package ExerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);	 
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2 , qtd1, qtd2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1*qtd1 + preco2*qtd2;
		
		System.out.print("C�digo do primeiro item: " + cod1);
		System.out.println(", C�digo do segundo item: " + cod2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
	sc.close();
	
	
	}
}
