package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		
		System.out.print("Informe o código do produto: ");
		cod = sc.nextInt();
		
		System.out.print("Informe a quantidade do produto: ");
		qtd = sc.nextInt();
		
		double total = 0.0;
		
		if(cod == 1) {
			total = 4.00 * qtd;
		}
		else if(cod == 2) {
			total = 4.50 * qtd;
		}
		else if(cod == 3) {
			total = 5.00 * qtd;
		}
		else if(cod == 4) {
			total = 2.00 * qtd;
		}
		else if (cod == 5) {
			total = 1.50 * qtd;
		}
		else {
			System.out.println("CODIGO DO PRODUTO INFORMADO É INVALIDO!");
		}
		
		if(total != 0) {
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
	}
}
