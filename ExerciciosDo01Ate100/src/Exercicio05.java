import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número INTEIRO: ");
		int num = sc.nextInt();
		
		int sucessor = num + 1;
		
		System.out.println("O sucessor de '" + num + "' é: " + sucessor);
		sc.close();
	}
}
