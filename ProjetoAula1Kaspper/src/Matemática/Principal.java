package Matemática;

public class Principal {

	public static void main(String[] args) 
	{
		Retangulo r1 = new Retangulo("Retângulo", "laranja", 10, 20);
		System.out.println("Eu sou um " + r1.getNome());
//		System.out.println("Minha área é: " + r1.calcularArea());
		System.out.printf("Minha área é: %.2f%n", r1.calcularArea());

System.out.println("------------------------------------------------");		

// Polimorfismo:
		Figura t1 = new Triangulo("Triângulo", "azul", 11, 25);
		System.out.println("Eu sou um " + t1.getNome());
//		System.out.println("Minha área é: " + t1.calcularArea());
		System.out.printf("%s %.2f%n", "Minha área é: ", t1.calcularArea());
		
System.out.println("------------------------------------------------");
		
		Circulo c1 = new Circulo("Circulo", "vermelho", 10);
		System.out.println("Eu sou um circulo: " + c1);
		System.out.printf("Minha área é: %.2f", c1.calcularArea());
	}

}
