
public class AulaArray {

	public static void main(String[] args) {
		// registrar 4 alunos e 3 notas calcular a média final e situação (aprovado/reprovado)
		
//		int[] outroArray;			:	outro jeito de fazer
//		outroArray = new int[10];	: 
		
//		String[] a = new String[100], b = new String[40]; : outro jeito de fazer
		
		int[] array = new int[5]; // inicializa o array do tipo int com 10 posições.
		
		array[0] = 12;
		array[1] = 8;
		array[2] = 4;
		array[3] = 7;
		array[4] = 10;
		
		System.out.printf("%s %8s%n", "Indice", "Valor");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d %8d %n", i, array[i]); // '5d' indica número inteiro.
		//	System.out.println(i + "\t\t" + array[i]); // '\t' é o tab.
		}
		
	}

}
