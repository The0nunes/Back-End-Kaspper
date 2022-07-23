import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero inteiro: ");
		int num = sc.nextInt(); // informando o numero a ser convertido a bin�rio
	
		while(num != 0) { // enquanto 'num' for diferente de 0 far� o bloco abaixo
			
			if(num > 0) { // se 'num' for maior que 0 far� o bloco abaixo
				num = num / 2; // 'num' est� recebendo uma divis�o de 'num' e 2
				System.out.print(num % 2); // est� imprimindo o valor do resto da divis�o entre 'num' e 2
			}
		}
		
		
		sc.close();
	}

}
