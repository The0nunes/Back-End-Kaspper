package fundamentos;

public class Temperatura 
// 	DESAFIO :
//C e F definir como variaveis comuns
//formula de coners�o de F para c 
//armazenar o n�mero 32 como constante
//armazenar o calculo 5/9 tamb�m como constante

//c = ( F - 32) * 5/9;	
{
	public static void main(String[] args) 
	{
	  final double FATOR = 5.0 / 9.0;
	  final double AJUSTE = 32;
		
	  double fahenreheit = 86;
	  double celsius = (fahenreheit - AJUSTE)*FATOR;
		
	  System.out.println("O resultado �: " + celsius +" Graus celsius.");
		
	  fahenreheit = 104;
	  celsius = (fahenreheit - AJUSTE)*FATOR;
		 
	  System.out.println("O resultado �: " + celsius + " Graus celsius.");
	  
	}
}
