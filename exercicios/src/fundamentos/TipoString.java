package fundamentos;

public class TipoString 
{
	public static void main(String[] args) 
	{
//	System.out.println("Opa gente boa!".charAt(11));
	
	String s = "Boa noite!";
	
	System.out.println(s.concat("!!!"));	
	System.out.println(s + "!");
//"concat" e "+" : mesma função.
	
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));	
	System.out.println(s.toUpperCase().endsWith("noite"));
	System.out.println(s.length());
	System.out.println(s.equals("boa noite"));
	System.out.println(s.equalsIgnoreCase("boa noite"));
	
	}

}
