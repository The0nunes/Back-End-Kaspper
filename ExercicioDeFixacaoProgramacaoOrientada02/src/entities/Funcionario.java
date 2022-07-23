package entities;

public class Funcionario {
	// EXERICIO 02: Programa para ler os dados de um funcionário e calcular o seu salário bruto.	
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentaSalário(double porcentagem) {
		salarioBruto = (salarioBruto / porcentagem) + salarioBruto;
	}
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f",salarioLiquido());
	}
}