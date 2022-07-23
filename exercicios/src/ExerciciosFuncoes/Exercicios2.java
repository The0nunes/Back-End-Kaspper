package ExerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14159;
		double raio, area;

		System.out.print("Digite o valor do raio: ");
	
		raio = sc.nextDouble();
		area = PI*(raio*raio);
	
		System.out.printf("A área é %.4f%n", area);
	
	sc.close();

	}

}
