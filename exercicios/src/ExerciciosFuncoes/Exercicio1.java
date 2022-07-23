package ExerciciosFuncoes;
import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args) 
	{
		int a, b, soma;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores: "); 
	
		a = sc.nextInt(); 
		b = sc.nextInt();
		
		soma = a + b;
	
		System.out.println("SOMA = " + soma );
	
	sc.close();
	}
}
