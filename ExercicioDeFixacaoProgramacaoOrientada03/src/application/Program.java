package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
// EXERCICIO 03: Programa para três notas de um aluno, somar e mostrar se o aluno passou ou não.
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();		
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		aluno.notaFinal(); 
		
		double notaFaltando = 60;
		
		System.out.println("Nota Final: " + aluno);
		
		if(aluno.notaFinal() >= 60) {
			System.out.println("PASSOU");
		}
		else {
			aluno.notaFaltando(notaFaltando);
			System.out.println("REPROVOU");
			System.out.printf("Faltou :%.2f", aluno.notaFaltando);
		}	
		
		sc.close();
	}

}
