import javax.swing.JOptionPane;

public class CalculaMedia {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome:"); // aparece na tela uma caixinha perguntando o seu nome.
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 1ª nota.
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 2ª nota.
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a terceira nota ?: ")); // aparece na tela uma caixinha perguntando qual a sua 3ª nota.
		
		double media = (nota1 + nota2 + nota3) / 3; // procedência de Cálculo.
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Auno: " + nome + "\nSua média é: " + media + "\nVocê está APROVADO!"); // aparecerá se a média do aluno for maior ou igual a 6.
		}else {
		JOptionPane.showMessageDialog(null, "Auno: " + nome + "\nSua média é: " + media + "\nVocê está REPROVADO!"); // aparecerá na tela se a nota do aluno for menor que 6.
		}
		
	}

}
