package FuncoesString;

public class FuncoesString01 {

	public static void main(String[] args) 
	{
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toLowerCase(); // Deixa em minúsculo.
		String s02 = original.toUpperCase(); // Deixa em maiúsculo.
		String s03 = original.trim(); // Tira os espaços nas extremidades do texto.
		String s04 = original.substring(2); // Começa a partir do caractere que está entre parenteses.
		String s05 = original.substring(2, 9); // Começa a partir de um caractere e termina no outro que está entre parenteses.
		String s06 = original.replace('a', 'x'); // Substitui um caractere por outro.
		String s07 = original.replace("abc", "xy"); // Mas não apenas só um caractere, também pode varios.
		
		int i = original.indexOf("bc"); // Conta em que "casa" está o caractere.
		int j = original.lastIndexOf("bc"); // Conta em que "casa" está o ÚLTIMO caractere.
		
		System.out.println("Original:         -" + original + "-");
		System.out.println("toLowerCase:      -" + s01 + "-");
		System.out.println("toUperCase:       -" + s02 + "-");
		System.out.println("trim      :       -" + s03 + "-");        
		System.out.println("substring  :      -" + s04 + "-");
		System.out.println("substring(2,9)  : -" + s05 + "-");
		System.out.println("replace :         -" + s06 + "-");
		System.out.println("replace(abc,xy) : -" + s07 + "-");
		System.out.println("Index Of 'bc': " + i);
		System.out.println("Last Index Of 'bc': " + j);		
	}

}
