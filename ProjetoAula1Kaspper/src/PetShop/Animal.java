package PetShop;

public class Animal {
// sempre come�ar declarando os atributos e depois os m�todos.	

// ATRIBUTOS: � o que eles s�o.
	private String nome; // colocando "private" n�o deixa a classe principal modificar diretamente.
	private String especie;
	private int idade;
	
// CONSTRUTOR: � o m�todo que nos permite criar um objeto para o animal.
// sempre tem que ter o nome da classe.
// usa "this" para ref�nciar o atributo.	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
// M�TODOS:	� o que eles fazem.
	public void vacinar() {
		System.out.println("O animal foi vacinado");
	}
	public void consultar() {
		System.out.println("O animal foi consultado");
	}
	public void fazerAniversario() {
		this.idade++; // adicionando a idade.
		System.out.println("Agora o animal tem " + this.idade + " anos");
	}

// geters e seters: 
// o GET � para fazer a leitura de alguma de dados ou do conte�do de um atributo.	
	public String getNome() { // fazer a leitura do nome.
		return nome;
	}
// o SET � para inserir ou modificar o conte�do de um atributo.
	public void setNome(String nome) { 
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade > 0) { // colocando um IF para n�o ter idade negativa, apenas positiva.
			this.idade = idade;
			System.out.println("A idade agora � " + this.idade);
		}
		else {
			System.out.println("N�o existe idade negativa");
		}
	}
	
}