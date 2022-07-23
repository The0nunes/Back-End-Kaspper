package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Informe um número: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}
}
