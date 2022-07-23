package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N]; // instanciando a matriz.

		for (int i = 0; i < M; i++) {		// Os dois 
			for (int j = 0; j < N; j++) {	//	FOR para correr a matriz inteira.
				mat[i][j] = sc.nextInt();
			}

		}

		int X = sc.nextInt(); // entrando com o valor de X na matriz.

		for (int i = 0; i < M; i++) { // M é o numero de linhas.

			for (int j = 0; j < N; j++) { // N é o numero de colunas.
				
				
				   
			}		
		}
		sc.close();
	}
}