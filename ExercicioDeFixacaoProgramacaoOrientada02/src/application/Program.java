package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
// EXERICIO 02: Programa para ler os dados de um funcion�rio e calcular o seu sal�rio bruto.
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
System.out.println();
		
		System.out.println("Funcion�rio: " + funcionario);
		
System.out.println();
		
		System.out.print("Qual porcentagem aumentar o salario?: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentaSal�rio(porcentagem);
		
System.out.println();
		
		System.out.print("Dados atualizados: " + funcionario);
		
		sc.close();

	}

}