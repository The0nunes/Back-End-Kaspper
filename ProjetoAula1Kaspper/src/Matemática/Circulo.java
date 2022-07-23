package Matemática;

public class Circulo extends Figura{ // subclasse de Figura.
	
	private double raio;
	private final double PI = Math.PI;
	

	public Circulo(String nome, String cor, double raio) { // não precisa colocar o PI porque ele nunca vai mudar.
		super(nome, cor);
		this.raio = raio;
	}

	@Override // significa que está herdando e sobreescrevendo o método.
	public double calcularArea() {
		return this.PI * Math.pow(this.raio, 2); // Math.pow: calcula a patência.
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	
}