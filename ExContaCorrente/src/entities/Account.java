package entities;

public class Account {
//	ATRIBUTOS da CLASSE:
	private int numero;
	private String nomeTitular;
	private double saldo;
	
	public Account(int numero, String nomeTitular) { // MÉTODO da CLASSE.
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}
	
	public Account(int numero, String nomeTitular, double depositoInicial) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
//		saldo = saldo + quantia;		
	}
	
	public void saque(double quantia) { // 5.0 é a taxa.
		saldo -= quantia + 5.0;
//		saldo = saldo - (quantia + 5.0);		
	}
	
	public String toString() {
		return "Conta "
			+	numero
			+	", Nome do titular: "
			+	nomeTitular
			+	", "
			+	"Saldo: $ "
			+	String.format("%.2f", saldo);
	}
}