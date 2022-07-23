import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o raio da circunferência ?:");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, raio);
		double perimetro = 2 * Math.PI * raio;
		
		System.out.printf("A área da circunfErência: %.2f",  area);
		System.out.printf("A perímetro da circunferência: %.2f",  perimetro);
		
		sc.close();
	}
}
