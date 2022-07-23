package application;

import java.util.Scanner;

import enttities.Aluguel;

public class Program {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10]; // "[10]" representa o número de quartos disponieis.
		
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt(); // entrar com o número de quartos.
		
		for(int i = 1; i <= quantity; i++) {// FOR iniciado a partir do número 1 ou linha 1, definindo a partir de rent 1 e a condição ser menor ou igual a 3.
			System.out.println(); // PULANDO LINHA.
			System.out.println("Rent #" + i + ":"); // demostrando a "rent #" a ser digitada.
			System.out.print("Name: "); // informar o nome do hospede.
			sc.nextLine(); // passar a próxima linha.
			String name = sc.nextLine(); // entrando com o nome.
			System.out.print("Email: "); // informar o email.
			String email = sc.nextLine(); // entrando com o email.
			System.out.print("Room: "); // informando o quarto.
			int room = sc.nextInt(); // entrando com o quarto.
			vect[room] = new Aluguel(name, email); // VETOR nome, email.
		}
		System.out.println(); // PULANDO LINHA.
		System.out.println("Busy rooms:"); // mensagens de quartos ocupados.
		
		for(int i = 1; i < 10; i++) { // FOR usado junto com IF para imprimir nos vetores apenas os quartos utilizados diferentes de NULL.
			
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();		
	}
}	
