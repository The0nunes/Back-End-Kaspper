package EstruturaCondicional;

import java.util.Scanner;

public class EncadeamentoEstruturaCondicionais 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Que horas são? ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("bom dia!");
		} else if (hora < 18) {
			System.out.println("BOA TARDE!");
		} else {
			System.out.println("BOA NOITE!");
		}

		sc.close();
	}
}