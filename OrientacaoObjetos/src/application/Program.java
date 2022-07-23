package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com as medidas do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Area do Triangulo X : %.4f%n", areaX);
		System.out.printf("Area do Triangulo Y : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O triangulo com a maior area eh o X");
		} else {
			System.out.println("O triangulo com a maior area eh o Y");
		}
		
		sc.close();
	}

}