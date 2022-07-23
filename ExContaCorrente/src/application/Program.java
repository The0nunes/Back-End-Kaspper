package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular da conta:  ");
		sc.nextLine(); // para forçar a quebra de linha.
		String nomeTitular = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0); // charAt(0) significa pegar a primeira letra ou caractere.
		
		if (resposta == 's') {			
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Account(numero, nomeTitular, depositoInicial);
		}	
		else {	
			conta = new Account(numero, nomeTitular);	
		}	
			
		System.out.println();
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor a ser depositado: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor a ser sacado: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}