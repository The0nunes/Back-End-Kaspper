import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome:"); // aparece na tela uma caixinha perguntando o seu nome.
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 1� nota.
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 2� nota.
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a terceira nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 3� nota.
		
		double media = (nota1 + nota2 + nota3) / 3; // proced�ncia de C�lculo.
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Auno: " + nome + "\nSua m�dia �: " + media + "\nVoc� est� APROVADO!"); // aparecer� se a m�dia do aluno for maior ou igual a 6.
		}else {
		JOptionPane.showMessageDialog(null, "Auno: " + nome + "\nSua m�dia �: " + media + "\nVoc� est� REPROVADO!"); // aparecer� na tela se a nota do aluno for menor que 6.
		}
		
	}

}
