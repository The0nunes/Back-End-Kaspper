package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite três números para ser efetuada a média: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		double media1 = (n1 + n2 + n3) / 3;
		System.out.println("A média é: " + media1);
		System.out.println("--------------------");

		System.out.print("Digite outros três números para ser efetuada a média: ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		double media2 = (x1 + x2 + x3) / 3;
		System.out.println("A média é: " + media2);
		System.out.println("---------------------");

		double mediaMedia = media1 + media2;

		System.out.println("A soma das duas médias aritméticas é: " + mediaMedia);

		sc.close();



	}
}
