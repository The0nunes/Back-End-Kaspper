package Matem�tica;

public class Principal {

	public static void main(String[] args) 
	{
		Retangulo r1 = new Retangulo("Ret�ngulo", "laranja", 10, 20);
		System.out.println("Eu sou um " + r1.getNome());
//		System.out.println("Minha �rea �: " + r1.calcularArea());
		System.out.printf("Minha �rea �: %.2f%n", r1.calcularArea());

System.out.println("------------------------------------------------");		

// Polimorfismo:
		Figura t1 = new Triangulo("Tri�ngulo", "azul", 11, 25);
		System.out.println("Eu sou um " + t1.getNome());
//		System.out.println("Minha �rea �: " + t1.calcularArea());
		System.out.printf("%s %.2f%n", "Minha �rea �: ", t1.calcularArea());
		
System.out.println("------------------------------------------------");
		
		Circulo c1 = new Circulo("Circulo", "vermelho", 10);
		System.out.println("Eu sou um circulo: " + c1);
		System.out.printf("Minha �rea �: %.2f", c1.calcularArea());
	}

}
