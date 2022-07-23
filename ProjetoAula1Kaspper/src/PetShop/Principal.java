package PetShop;

public class Principal {

	public static void main(String[] args) 
	{
// instanciar um objeto da classe animal.
		Animal a1 = new Animal("Otto", "gato", 2);// dando "vida" a um animal.
		Animal a2 = new Animal("Totó", "cachorro", 5);
		Animal a3 = new Animal("Psiu", "passarinho", 2);
		
		System.out.println("O animal " + a1.getNome() + " é um " + a1.getEspecie() + " e tem " + a1.getIdade() + " anos.");
		System.out.println("O animal " + a2.getNome() + " é um " + a2.getEspecie() + " e tem " + a2.getIdade() + " anos.");
		System.out.println("O animal " + a3.getNome() + " é um " + a3.getEspecie() + " e tem " + a3.getIdade() + " anos.");
		
		a1.vacinar();
		a2.consultar();
		a3.fazerAniversario();
		
		a1.setIdade(5);
//		a1.idade = -3; 
	}
}	
