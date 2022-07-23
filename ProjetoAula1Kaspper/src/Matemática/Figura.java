// uma superClasse -> Figura -> nome, cor -> calcularArea()
//		subclasses -> Retangulo
//		  		      Triangulo
//					  Circulo

// Interface -> FiguraInterface -> CalcularArea()

package Matemática;
// SUPERCLASSE:
public abstract class Figura implements FiguraInterface{ // delegando para as subclasses.
	
	private String nome;
	private String cor;
	
	public Figura(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}


// SuperClasse -> Animal
				// Cachorro
//subclasse:	// Gato		
				// Passaro

// SuperClasse -> ContaBancária - titular, mumConta, numAg, saldo. <- ATRIBUTOS.
//							  	- depositar(), sacar(). <- MÉTODOS.

				// ContaCorrente
//subclasse:	// ContaEspecial  
				// ContaPoupança

// TODAS as subclasses herdam os atributos e os métodos da superclasse.
// os métodos herdados podem ter comportamentos diferentes nas subclasses reescrevendo - os.

// Interface - contrato assinado pela classe, onde são listados todos os, métodos que a classe é obrigada a implementar.

// a SuperClasse é uma classe mais generica, e a subclasse é a especificação.