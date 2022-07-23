package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) 
	{ //		Vetor (vect):
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];// Esse comando cria o vetor.

//		vetor (vect) se faz com FOR.		
		for(int i = 0; i < n; i++) {// Maneira de armazernar o vetor.
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0;  i < n; i++) {
			soma += vect[i];// ou soma = soma + vect[i];
		}
		
		double media = soma / n;
		System.out.printf("Média das alturas: %.2f%n", media);
		
		
		sc.close();
	}

}
