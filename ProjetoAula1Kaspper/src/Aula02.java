
public class Aula02 {

	public static void main(String[] args) 
	{
		int posicao = 1;
		
// a estrutura de desvio condicional: switch � para verificar o conteudo de uma variavel
// assim como o IF		
		switch(posicao){
			case 1:
				System.out.println("Voc� � o campe�o!");
				break;
			case 2:
				System.out.println("Voc� chegou em 2� lugar");
				break;
			case 3:
				System.out.println("Voc� chegou em 3� lugar");
				break;	
			case 4: case 5: case 6: 
				System.out.println("Voc� vai ganhar um pr�mio de participa��o");
				break;
			default:
				System.out.println("Nenhuma premia��o");
		}
	}
}
