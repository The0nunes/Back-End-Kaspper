package util;

public class Calculadora {

	public static final double PI = 3.14159; // NOME DE CONSTANTES SEMPRE EM MAI�SCULAS.	
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 * PI * Math.pow(raio, 3)/ 3;
	}
}