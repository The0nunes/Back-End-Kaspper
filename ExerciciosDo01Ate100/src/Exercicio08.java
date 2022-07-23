import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temperatura em fahrenheit: ");
		double tempF = sc.nextDouble();
		
		double tempC = (tempF - 32) * 5 / 9 ;
		
		System.out.printf("A temperatura em graus celsius é: %.2f", tempC);
		
		sc.close();
	}

}
