package ExerciciosFuncoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14159;
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
	
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
	
		triangulo = (A * C) /2.0;
		circulo = PI*(C * C);
		trapezio = (A + B) * C /2.0;	
		quadrado = B * B;
		retangulo = A * B;
	
		System.out.printf("TRIANGULO: %.3f %n ", triangulo);
		System.out.printf("CRICULO: %.3f %n ", circulo);
		System.out.printf("TRAPEZIO: %.3f %n ", trapezio);
		System.out.printf("QUADRADO: %.3f %n ", quadrado);
		System.out.printf("RETANGULO: %.3f %n ", retangulo);
	
	sc.close();
	}
}
