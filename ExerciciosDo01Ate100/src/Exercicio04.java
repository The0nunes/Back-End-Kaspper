import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o primeiro lado do tri�ngulo ?");
		double lado1 = sc.nextDouble(); 
		System.out.println("Qual o segundo lado do tri�ngulo ?");
		double lado2 = sc.nextDouble(); 
		System.out.println("Qual o terceiro lado do tri�ngulo ?");
		double lado3 = sc.nextDouble(); 
		
		double perimetro = lado1 + lado2 + lado3;
		
		System.out.printf("A per�metro da tri�ngulo: %.2f",  perimetro);
		
		sc.close();
	}

}
