package EstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionaCompostal {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas s�o? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia!");
		}
		else {
			System.out.println("boa tarde!");
		}
		
		
		
		
	sc.close();	
	}

}
