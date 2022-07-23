package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
// funcionalidades de uma anotação ponto (s.)

		String s = "Bom dia X";

		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		System.out.println("Osvaldo!!!".toLowerCase());

		String x = "Osvaldo!!!".toUpperCase();
		System.out.println(x);

		String y = "Bom dia X"
				.replace("X", "Rafa")
				.toUpperCase()
				.concat("!!!!!");
		System.out.println(y);

// tipo primitivos nao tem o operador "."
		int a = 3;
		System.out.println(a);
	}

}
