package kaspperBank;

public class Conta { // Classes são tipos.
// PROPRIEDADES/ATRIBUTOS são variaveis.	
	String titular;
	double saldo;
	int agencia;
	int numero;
	
// Métodos são as ações que podem ser feitas na classe ou pela classe.	

// sacar, depositar, transferir.
	
	void deposita(double valor){ 
		this.saldo = this.saldo + valor; // ou this.saldo += valor;
	}
	
	void saca(double valor) {	
		if(this.saldo >= valor) {
			this.saldo -= valor; //ou this.saldo = this.saldo - valor;			
		}else {
			System.out.println("Não pode sacar o valor: " + valor);
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		// contaDoUbiraci.transfere(1500, contaDaRosilene)
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}else {
			return false;
		}
		
	}
}