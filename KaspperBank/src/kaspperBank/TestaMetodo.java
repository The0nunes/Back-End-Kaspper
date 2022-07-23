package kaspperBank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoUbiraci = new Conta();
		Conta contaDaRosilene = new Conta();

		contaDoUbiraci.saldo = 2000;
		contaDaRosilene.saldo = 0;

		contaDoUbiraci.transfere(1000, contaDaRosilene);
		
		System.out.println("Conta do Ubiraci: " + contaDoUbiraci.saldo);
		System.out.println("Conta da Rosilene: " + contaDaRosilene.saldo);
		
		
	}
}
