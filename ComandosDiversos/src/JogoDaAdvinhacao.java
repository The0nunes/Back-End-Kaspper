import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {
		
		int numSorteado = new Random().nextInt(10) + 1;
		int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o seu palpite? "));

		if (numSorteado == palpite) {
			JOptionPane.showMessageDialog(null,"Voc� acertou");
		} else {
			JOptionPane.showMessageDialog(null,"Voc� errou");
			JOptionPane.showMessageDialog(null,"O n�mero sorteado foi " + numSorteado);
		}
	
	}
}

