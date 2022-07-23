package Matemática;

public class Retangulo extends Figura{// subclasse de Figura.

	private double altura;
	private double base;
	
	public Retangulo(String nome, String cor, double altura, double base) {
		super(nome, cor);	// ele tá pegando lá da superclasse Figura.
		this.altura = altura;
		this.base = base;
	}

	@Override // significa que está sobreescrevendo o método.
	public double calcularArea() {
		return this.base * this.altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	} 
	
	
	
}
