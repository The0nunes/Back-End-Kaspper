import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as medidas do retângulo: ");
		System.out.print("Qual a base ?: ");
		double base = sc.nextDouble();
		System.out.print("Qual a altura ?: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		System.out.printf("A área do retângulo: %.2f",  area);
		System.out.printf("A perímetro do retângulo: %.2f",  perimetro);
		
		sc.close();
	}

}
