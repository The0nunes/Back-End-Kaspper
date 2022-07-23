import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacaoMelhoria {

	public static void main(String[] args) {
//		melhoria: o programa deve registrar 
//		a quantidade de chutes do usu�rio e ao final quando ele acertar informar em quantos palpites ele acertou.
//		e quando errar informar "insultos leves"....
		
		Scanner sc = new Scanner(System.in);
		
		int numSorteado = new Random().nextInt(10) + 1;
		String[] zoacao = { "Passou longe!", "T� esquentando!", "Quer um ajuda a� ?", "Existem outros n�meros al�m deste...", "T� melhorando...",
							"�, seria melhor desistir..."};
		char resp = 's';
		
		for(int i = 0; resp == 's'; i++) {
			System.out.print("D� um palpite de 0 a 10: ");
			int palpite = sc.nextInt();
			
			if(palpite == numSorteado) {
				System.out.println("Voc� acertou em " + (i+1) + " tentativas"); // '(i+1)' � o contador de tentativas
				resp = 'n';
			} else {
					System.out.println("VOC� ERROU  " + zoacao[new Random().nextInt(zoacao.length)]); // pegando um valor aleat�rio dentro do array 'zoacao'
					System.out.print("Quer chutar um numero? (s/n): ");
					resp = sc.next().charAt(0);				
				if(resp == 'n') {
					System.out.println("Voc� desistiu depois de " + (i+1) + " tentativas"); 
				}
			}
			System.out.println(); // pula uma linha para separar cada tentativa
		}			
		
		sc.close();
	
	}
}