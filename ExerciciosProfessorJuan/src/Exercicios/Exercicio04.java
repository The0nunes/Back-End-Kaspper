package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a porcentagem do IPI a ser acrescido no valor das peças ?: ");
		int ipi = sc.nextInt();
		
		System.out.print("Código da peça 1: ");
		int cod1 = sc.nextInt();
		System.out.print("Qual o valor unitário da peça 1 ?: ");
		double valor1 = sc.nextDouble();
		System.out.print("Qual a quantidade de peças ?: ");
		int qtd1 = sc.nextInt();
		System.out.println("----------------------------");
		
		System.out.print("Código da peça 2: ");
		int cod2 = sc.nextInt();
		System.out.print("Qual o valor unitário da peça 2 ?: ");
		double valor2 = sc.nextDouble();
		System.out.print("Qual a quantidade de peças ?: ");
		int qtd2 = sc.nextInt();
		System.out.println("----------------------------");
		
		System.out.print("Código da peça 3: ");
		int cod3 = sc.nextInt();
		System.out.print("Qual o valor unitário da peça 3 ?: ");
		double valor3 = sc.nextDouble();
		System.out.print("Qual a quantidade de peças ?: ");
		int qtd3 = sc.nextInt();
		System.out.println("----------------------------");
		
		double total = (valor1 * qtd1) + (valor2 * qtd2) + (valor3 * qtd3) * ((ipi / 100) + 1);
		System.out.println("----------------------------");

		System.out.println("O código da peça 1 é: " + cod1);
		System.out.println("O código da peça 2 é: " + cod2);
		System.out.println("O código da peça 3 é: " + cod3);
		System.out.println("E o total é: " + total);

		sc.close();
		

	}
}
