import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {
		
		int numSorteado = new Random().nextInt(10) + 1;
		int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o seu palpite? "));

		if (numSorteado == palpite) {
			JOptionPane.showMessageDialog(null,"Você acertou");
		} else {
			JOptionPane.showMessageDialog(null,"Você errou");
			JOptionPane.showMessageDialog(null,"O número sorteado foi " + numSorteado);
		}
	
	}
}

