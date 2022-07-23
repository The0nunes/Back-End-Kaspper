import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade em dias ? ");
		int idadeDias = sc.nextInt(); // informando o número de dias
		
		int idadeAno = 0; // inicializando o contador de anos
		int idadeMes = 0; // inicializando o contador de meses
		
		
		for(int i = 0; i <= idadeDias; i++) { // irá para quando 'i' ser menor ou igual a 'idadeDias'
			
			if(idadeDias >= 365) { // se o numero de dias for maior ou igual a 365 fará o bloco abaixo
				idadeAno = idadeAno + 1; // 'idadeAno' irá receber 1
				idadeDias = idadeDias - 365; // subtrair 365 de 'idadeDias' 
			}
			if(idadeMes <= 30) { // se a variavel 'idadeMes' for menor ou igual a 30 fará o bloco abaixo 
				idadeMes = idadeMes + 1; // adicionando 1 para a variavel 'idadeMes'
				idadeDias = idadeDias - 30; // subtraindo 30 de 'idadeDias'
				
				if(idadeMes == 12) { // se a variavel 'idadeMes' chegar a 12 fará o bloco abaixo
					idadeAno = idadeAno + 1; // acrescentando 1 a variavel 'idadeAno'
					idadeDias = idadeDias - 365; // subtraindo 365 da variavel 'idadeDias'
				}
			}
			
		}
		System.out.println("O equivalente em anos é: " + idadeAno + " ano(s) " + idadeMes + " mes(s) " + idadeDias + " dia(s)");
		
		
		sc.close();
	}

}
