package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		final double salMin = 788.00;
		
		System.out.print("Qual � o seu sal�rio atual ?: ");
		double salUsuario = sc.nextDouble();
		
		double qtdSalMinimo = salUsuario / salMin;
		
		System.out.printf("O usu�rio recebe o equivalente a %.1f sal�rio(s) min�mo(s).", qtdSalMinimo);
		
		sc.close();
		

	}
}
