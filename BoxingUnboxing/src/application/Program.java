package application;

public class Program {

	public static void main(String[] args) 
	{
		int x = 20;
		
		Object obj = x;// Object � o "pai" de todas as classes, � uma classe que encapsula todas as classes.	
		System.out.println(obj);		
		int y = (int) obj; // convers�o / casting.		
		System.out.println(y);
		
		Integer obi = x;// wrapper classes.		
		System.out.println(obi);		
		int l = obi * 2;// n�o precisa converter / casting.		
		System.out.println(l);
	}

}