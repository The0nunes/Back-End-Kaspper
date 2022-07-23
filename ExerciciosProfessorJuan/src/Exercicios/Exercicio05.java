package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		final double salMin = 788.00;
		
		System.out.print("Qual é o seu salário atual ?: ");
		double salUsuario = sc.nextDouble();
		
		double qtdSalMinimo = salUsuario / salMin;
		
		System.out.printf("O usuário recebe o equivalente a %.1f salário(s) minímo(s).", qtdSalMinimo);
		
		sc.close();
		

	}
}
