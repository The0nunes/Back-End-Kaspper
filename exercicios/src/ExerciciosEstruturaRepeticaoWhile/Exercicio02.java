package ExerciciosEstruturaRepeticaoWhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) 
	{ 
// x > 0 && y > 0 : primeiro, x < 0 && y > 0: segundo, x < 0 && y < 0: terceiro, x > 0 && y < 0: quarto;

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) 
		{
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("fim do programa");
		sc.close();

	}

}
