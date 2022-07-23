import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número INTEIRO: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo número INTEIRO: ");
		int num2 = sc.nextInt();
		
		int quociente = num1 / num2;
		int resto = num1 % num2;
		
		System.out.println("O quociente: " + quociente);
		System.out.println("O resto da divisão: " + resto);
		
		sc.close();
	}

}
