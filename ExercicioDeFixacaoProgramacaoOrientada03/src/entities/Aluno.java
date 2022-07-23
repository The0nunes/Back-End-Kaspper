package entities;

public class Aluno {
	// EXERCICIO 03: Programa para três notas de um aluno, somar e mostrar se o aluno passou ou não.
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFaltando;
	
	public double notaFinal () {
		 return nota1 + nota2 + nota3;
	}
	public void notaFaltando (double notaFaltando) {
		this.notaFaltando =  notaFaltando - notaFinal();
	}
	public String toString() {
		return  String.format("%.2f", notaFinal());
	}
	
}		