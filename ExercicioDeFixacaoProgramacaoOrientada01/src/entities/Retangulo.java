package entities;

public class Retangulo {
// 	EXERCICIO 01: Programa para ler a altura e largura de um retangulo e fazer (Area, Perímetro e Diagonal).	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	public double perimetro() {
		return 2 * (largura + altura);
	}
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
	
}	
