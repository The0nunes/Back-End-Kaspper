package Matem�tica;

public class Circulo extends Figura{ // subclasse de Figura.
	
	private double raio;
	private final double PI = Math.PI;
	

	public Circulo(String nome, String cor, double raio) { // n�o precisa colocar o PI porque ele nunca vai mudar.
		super(nome, cor);
		this.raio = raio;
	}

	@Override // significa que est� herdando e sobreescrevendo o m�todo.
	public double calcularArea() {
		return this.PI * Math.pow(this.raio, 2); // Math.pow: calcula a pat�ncia.
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