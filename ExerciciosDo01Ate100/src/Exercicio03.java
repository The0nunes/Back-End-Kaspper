import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o raio da circunfer�ncia ?:");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, raio);
		double perimetro = 2 * Math.PI * raio;
		
		System.out.printf("A �rea da circunfEr�ncia: %.2f",  area);
		System.out.printf("A per�metro da circunfer�ncia: %.2f",  perimetro);
		
		sc.close();
	}
}
