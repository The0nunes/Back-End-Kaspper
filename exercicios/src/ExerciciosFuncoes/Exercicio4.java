package ExerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorHora, salario;
		
		System.out.println("Informa��es do funcion�rio: ");
	
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
	
		salario = valorHora*horas;
	
		System.out.println("N�MERO: " + numero);
		System.out.printf("SAL�RIO: " + "U$ %.2f", salario);
	
	sc.close();
	}

}
