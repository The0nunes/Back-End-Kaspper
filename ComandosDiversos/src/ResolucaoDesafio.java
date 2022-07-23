import java.util.Locale;

import javax.swing.JOptionPane;

public class ResolucaoDesafio {

	public static void main(String[] args) {
		// registrar 4 alunos e 3 notas calcular a
		// média final e situação (aprovado/reprovado)

		Locale.setDefault(Locale.US);
		String[] aluno = new String[4];
		double[] notas = new double[3];
		double[] medias = new double[4];

		int i = 0;
		int j = 0;
		int q = 0;
		while (i < aluno.length) {
			aluno[i] = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
			i++;

			while (j < notas.length) {
				notas[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota: "));
				j++;
			}
			medias[q] = (notas[0] + notas[1] + notas[2]) / 3;
			q += 1;
			j = 0;
		}
		
		for(i = 0; i < aluno.length; i++) {
			if(medias[i] >= 6) {
				System.out.printf("%s %s \t%s %.1f %s%n", "Aluno ", aluno[i], "Média: ", medias[i], " Aprovado.");
			}else {
				System.out.printf("%s %s \t%s %.1f %s%n", "Aluno ", aluno[i], "Média: ", medias[i], " Reprovado.");
			}
		}		
		
	}

}
