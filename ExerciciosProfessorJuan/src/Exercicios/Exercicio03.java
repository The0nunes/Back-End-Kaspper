package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual é o seu saldo ?: ");
		double saldo = sc.nextDouble();

		double reajuste = saldo - (saldo * 0.01);

		System.out.println("Saldo depois do reajuste de 1% :  " + reajuste);

		sc.close();


	}

}
