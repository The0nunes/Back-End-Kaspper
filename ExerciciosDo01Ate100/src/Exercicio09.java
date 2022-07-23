import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o raio da lata de oleo ?: ");
		double raio = sc.nextDouble();
		System.out.print("Qual a altura da lata de oleo ?: ");
		double altura = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio, raio) * altura;
		
		System.out.printf("Volume da lata: ", volume);
		
		sc.close();
	}

}
