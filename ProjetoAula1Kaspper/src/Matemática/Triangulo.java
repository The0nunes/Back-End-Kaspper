package Matemática;

public class Triangulo extends Figura{ // subclasse de Figura.
	
	private double base;
	private double altura;

	public Triangulo(String nome, String cor, double base, double altura) {
		super(nome, cor); // estão sendo herdados da superclasse Figura.
		this.base = base;
		this.altura = altura;
		
	}

	@Override // significa que está herdando e sobreescrevendo o método.
	public double calcularArea() {	
		return this.altura * this.base / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
