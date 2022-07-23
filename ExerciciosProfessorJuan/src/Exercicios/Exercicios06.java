package Exercicios;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número INTEIRO: ");
		int n = sc.nextInt();
		
		int antecessor = n - 1;
		int sucessor = n + 1;
		
		System.out.println("O antecessor de é: " + antecessor);
		System.out.println("O sucessor de é: " + sucessor);
		sc.close();
		

	}

}
