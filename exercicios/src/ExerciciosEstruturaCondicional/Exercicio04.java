package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempo;
		
		System.out.print("Digite a hora de ínicio: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Digite a hora final: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			tempo = horaFinal - horaInicial;
		}
		else {
			tempo = 24 - horaInicial + horaFinal  ;
		}
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		sc.close();
	}
}
