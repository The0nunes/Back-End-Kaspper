package Biblioteca;

public class Livro {
	
	private String nome; // O modificador de acesso "private" impede que os atributos sejam acessados, tendo que inicializar os gatters e setters.
	private String autor;
	private int quantidadeLivro;
	private int quantLivrosDisponiveis;
	
	private final double valorEmpDiario = 3.10;
	
	public Livro(String nome, String autor, int quantidadeLivro) {
		this.nome = nome;
		this.autor = autor;
		this.quantidadeLivro = quantidadeLivro;
		this.quantLivrosDisponiveis = quantidadeLivro;
	}

// m�todos:	
	public void mostrarFicha() { // m�todo para mostrar as informa��es de cada livro.
		System.out.println("O nome do livro �: " + this.nome);
		System.out.println("O nome do autor �: " + this.autor);
		System.out.println("Temos " + this.quantLivrosDisponiveis + " livros dispon�veis");
		System.out.println("------------------------------------------------------------");
	}
	
	public boolean verificarDisponibilade() { // verificando a disponibilidade do livro.
		if(this.quantLivrosDisponiveis > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void emprestarLivro() { // m�todo de emprestar o livro, verificando a disponibilidade.
		if(verificarDisponibilade()) { // se for "true", empresta o livro.
			this.quantLivrosDisponiveis -= 1; // retira o livro emprestado.
			System.out.println("O livro foi emprestado com sucesso");
		}else {
			System.out.println("N�o temos esse livro dispon�vel para empr�stimo");
		}
	}

	public void devolverLivro() { // pega o livro de volta.
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			this.quantLivrosDisponiveis += 1; // soma o livro devolvido.
			System.out.println("Livro devolvido com sucesso!");
			System.out.println("Agora temos " + this.quantLivrosDisponiveis + " livros disponiveis");
		}else {
		  System.out.println("Nenhum livro desse est� emprestado atualmente");
		}
	}
	
	public double calcularValor(int quantDias) { // quantidade de dias que o livro ficou emprestado.
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			return quantDias * this.valorEmpDiario;
		}else {
			System.out.println("Esse livro n�o est� emprestado");
			return 0;
		}		
	}
	
	
	public String getNome() { // acessa o nome
		return nome;
	}

	public void setNome(String nome) { // modifica o nome
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}

	public int getQuantLivrosDisponiveis() {
		return quantLivrosDisponiveis;
	}

	public void setQuantLivrosDisponiveis(int quantLivrosDisponiveis) {
		this.quantLivrosDisponiveis = quantLivrosDisponiveis;
	}
	
	
	
	
	
	
}