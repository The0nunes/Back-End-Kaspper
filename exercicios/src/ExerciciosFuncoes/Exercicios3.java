package ExerciciosFuncoes;

import java.util.Scanner;

public class Exercicios3 
{
	public static void main(String[] args) 
	{
		int A, B, C, D, diferen�a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores: ");
	
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
	
		diferen�a = A * B - C * D;
		System.out.println("A diferen�a �: " + diferen�a);
	
	sc.close();
	}
}
