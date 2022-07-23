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
		
		System.out.println("Informações do funcionário: ");
	
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
	
		salario = valorHora*horas;
	
		System.out.println("NÚMERO: " + numero);
		System.out.printf("SALÁRIO: " + "U$ %.2f", salario);
	
	sc.close();
	}

}
