package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a sua idade: ");
		System.out.print("Ano(s): ");
		int ano = sc.nextInt();
		
		System.out.print("Mês(es): ");
		int mes = sc.nextInt();
		
		System.out.print("Dia(s): ");
		int dia = sc.nextInt();

		int somaAno = (ano * 365) + (mes * 30) + dia;

		System.out.println(ano + " ano(s) " + mes + " mes(es) " + dia + " dias" + " É o equivalente a: " + somaAno + " dias");

		sc.close();

	}

}
