
public class Aula02 {

	public static void main(String[] args) 
	{
		int posicao = 1;
		
// a estrutura de desvio condicional: switch é para verificar o conteudo de uma variavel
// assim como o IF		
		switch(posicao){
			case 1:
				System.out.println("Você é o campeão!");
				break;
			case 2:
				System.out.println("Você chegou em 2º lugar");
				break;
			case 3:
				System.out.println("Você chegou em 3º lugar");
				break;	
			case 4: case 5: case 6: 
				System.out.println("Você vai ganhar um prêmio de participação");
				break;
			default:
				System.out.println("Nenhuma premiação");
		}
	}
}
