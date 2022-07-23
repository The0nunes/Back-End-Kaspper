import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do quadrado: ");
		System.out.print("Qual o tamanho dos lados ?: ");
		double lado = sc.nextDouble();
		
		double area = lado * lado;
		double perimetro = 4 * lado;
		
		System.out.printf("A área do quadrado: %.2f",  area);
		System.out.printf("A perímetro do quadrado: %.2f",  perimetro);
		
		
		sc.close();
	}

}
