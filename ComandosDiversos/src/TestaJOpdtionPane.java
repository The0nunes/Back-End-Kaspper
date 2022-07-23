import javax.swing.JOptionPane;

public class TestaJOpdtionPane {

	public static void main(String[] args) {
		
		float pl = 1000.00f;
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")); // fazendo um casting trocando o valor que é uma String para um número inteiro.
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o teu salário ?: "));
		double valorTotal = salario + pl;
		JOptionPane.showMessageDialog(null, "Olá " + nome + "\nSua idade é: " + idade + "\nSalario + pl: " + valorTotal); // '\n' escreve a menssagem na linha de baixo.
	}

}
