package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exemplo2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];// vetor do tipo referencia.
		
		for(int i = 0; i < vect.length; i++) {// variavel "n" ou vect.length dá na mesma.
			sc.nextLine();// quebra de linha pendente.
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {// ou (int i = 0; i < n; i++);
			soma += vect[i].getPreco();// retorna o preço.
		}
		
		double media = soma / vect.length; // ou double media = soma / n;
		System.out.printf("MÉDIA DOS PREÇOS: %.2f%n", media);
		
		sc.close();
	}

}
