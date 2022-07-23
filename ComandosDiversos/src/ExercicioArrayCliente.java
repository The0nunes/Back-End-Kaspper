import javax.swing.JOptionPane;

public class ExercicioArrayCliente {

	public static void main(String[] args) {
		// criar um programa que recebe o nome de 3 clientes e os
		// seus respectivos preços dos rodutos e ao final informar o valor total da
		// compra

		String[] clientes = new String[3];
		double[] preco = new double[3];
		double[] valorTotal = new double[3];

		int h = 0;
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = JOptionPane.showInputDialog(null, "Nome do cliente: ");

			for (int j = 0; j < preco.length; j++) {
				preco[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço: "));

			}
			
			valorTotal[h] = preco[0] + preco[1] + preco[2];
			h += 1;
		}

		for (int i = 0; i < clientes.length; i++) {
			System.out.printf("%s %s \t%s %.1f %s%n", "Cliente ", clientes[i], "Valor Total: ", valorTotal[i]);
		}

	}
}
