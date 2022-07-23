import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numSorteado = new Random().nextInt(10) + 1;
		
		char resp = 's';
		
		while (resp == 's') {
			System.out.print("D� um palpite de 0 a 10: ");
			int palpite = sc.nextInt();

			if (palpite == numSorteado) {
				System.out.println("Voc� Acertou !!");
				resp = 'n';
			} else {
				System.out.println("Voc� Errou !!");
				System.out.print("Quer chutar um numero? (s/n): ");
				resp = sc.next().charAt(0);
				if(resp == 'n') {
					System.out.println("O n�mero sorteado foi: " + numSorteado);
				}
			}
			System.out.println(); // pulando uma linha para separar e deixar mais claro cada tentativa
		}
		
		
		sc.close();
	}

}
