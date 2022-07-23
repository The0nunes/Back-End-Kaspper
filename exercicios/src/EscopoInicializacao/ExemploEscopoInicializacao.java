package EscopoInicializacao;

public class ExemploEscopoInicializacao {

	public static void main(String[] args) 
	{
// qualquer estrutura entre chaves,  declarada em variavel
// ela nao é reconhecida no escopo global do programa
		
		double price = 150.00;
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0.00;
		}
		System.out.println(discount);
		
		
		
	}

}
