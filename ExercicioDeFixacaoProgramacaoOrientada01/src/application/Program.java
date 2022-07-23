package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
// 	EXERCICIO 01: Programa para ler a altura e largura de um retangulo e fazer (Area, Per�metro e Diagonal). 
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
				
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and heigth: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
				
		System.out.printf("AREA: %.2f%n",retangulo.area());		
		System.out.printf("PER�METRO: %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());

		sc.close();
	}

}
