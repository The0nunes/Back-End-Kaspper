package FuncoesString;

public class FuncaoSplit {

	public static void main(String[] args) 
	{
// Serve para imprimir cada uma das palavras separadas.		
		String s = "patato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
