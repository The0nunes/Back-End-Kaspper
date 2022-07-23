package ExerciciosEstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int aoQuadrado, aoCubo;
		
		double quadrado = 2;
		double cubo = 3;
		
		for(int i = 1; i <= N; i++) {
		aoQuadrado = (int) Math.pow(i, quadrado);
		aoCubo = (int) Math.pow(i, cubo);
		
		System.out.print(i + " ");
		System.out.print(" " + aoQuadrado + " ");
		System.out.println(" " + aoCubo);	
		
		}
		
	sc.close();
	
	}
}