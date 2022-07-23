package application;

public class Program {

	public static void main(String[] args) 
	{
		int x = 20;
		
		Object obj = x;// Object é o "pai" de todas as classes, é uma classe que encapsula todas as classes.	
		System.out.println(obj);		
		int y = (int) obj; // conversão / casting.		
		System.out.println(y);
		
		Integer obi = x;// wrapper classes.		
		System.out.println(obi);		
		int l = obi * 2;// não precisa converter / casting.		
		System.out.println(l);
	}

}