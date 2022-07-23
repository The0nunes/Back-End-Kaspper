
public class TestaCondicionalIf {

	public static void main(String[] args) {
		System.out.println("Testando os comandos condicionais");
		System.out.println("---------------------------------");
		int idade = 15; // criando um espaço na memória chamado 'idade' do tipo inteiro.
		boolean pais = true;
		
		// se a idade for maior que 18 pode entrar:
		
		if(idade >= 18 || pais == true) { // fazer desvios condicionais.
			System.out.println("Pode entrar");
		}else {
			System.out.println("Não pode entrar - vai pra Disney");
		}
		
		
	}

}
