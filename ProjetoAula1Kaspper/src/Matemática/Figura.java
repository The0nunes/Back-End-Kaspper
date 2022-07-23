// uma superClasse -> Figura -> nome, cor -> calcularArea()
//		subclasses -> Retangulo
//		  		      Triangulo
//					  Circulo

// Interface -> FiguraInterface -> CalcularArea()

package Matem�tica;
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

// SuperClasse -> ContaBanc�ria - titular, mumConta, numAg, saldo. <- ATRIBUTOS.
//							  	- depositar(), sacar(). <- M�TODOS.

				// ContaCorrente
//subclasse:	// ContaEspecial  
				// ContaPoupan�a

// TODAS as subclasses herdam os atributos e os m�todos da superclasse.
// os m�todos herdados podem ter comportamentos diferentes nas subclasses reescrevendo - os.

// Interface - contrato assinado pela classe, onde s�o listados todos os, m�todos que a classe � obrigada a implementar.

// a SuperClasse � uma classe mais generica, e a subclasse � a especifica��o.