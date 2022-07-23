import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número inteiro: ");
		int num = sc.nextInt(); // informando o numero a ser convertido a binário
	
		while(num != 0) { // enquanto 'num' for diferente de 0 fará o bloco abaixo
			
			if(num > 0) { // se 'num' for maior que 0 fará o bloco abaixo
				num = num / 2; // 'num' está recebendo uma divisão de 'num' e 2
				System.out.print(num % 2); // está imprimindo o valor do resto da divisão entre 'num' e 2
			}
		}
		
		
		sc.close();
	}

}
