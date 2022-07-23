import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numSorteado = new Random().nextInt(10) + 1;
		
		char resp = 's';
		
		while (resp == 's') {
			System.out.print("Dê um palpite de 0 a 10: ");
			int palpite = sc.nextInt();

			if (palpite == numSorteado) {
				System.out.println("Você Acertou !!");
				resp = 'n';
			} else {
				System.out.println("Você Errou !!");
				System.out.print("Quer chutar um numero? (s/n): ");
				resp = sc.next().charAt(0);
				if(resp == 'n') {
					System.out.println("O número sorteado foi: " + numSorteado);
				}
			}
			System.out.println(); // pulando uma linha para separar e deixar mais claro cada tentativa
		}
		
		
		sc.close();
	}

}
