
public class AulaArray2 {

	public static void main(String[] args) {
		// inicializar direto o array
		int[] array = {3, 50, 4, 6, 2, 8, 9, 10};
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d %8d %n", i, array[i]); // '5d' indica número inteiro e '%8' + alguma letra significa que está dando um espaço.
		//	System.out.println(i + "\t\t" + array[i]);
		}
		
	}

}
