package application;

public class Program {

	public static void main(String[] args) 
	{
		String[] vect = new String[] {
				"Maria", "Bob", "Alex"
		};

		for (int i=0; i<vect.length; i++) { // FOR normal.
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------"); // apenas diferenciar um FOR do outro
		
		for(String obj : vect) { // laço FOR EACH.
			System.out.println(obj);
		}
	}
}