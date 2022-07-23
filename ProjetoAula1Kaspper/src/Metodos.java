
public class Metodos {
// "public" � um modificador de acesso.
// "static" tira a obrigatoriedade de o metodo seja iniciado.
// "void" executa e n�o retorna nada.	
// "main" � a porta de entrada do programa.	
	
	public static void main(String[] args) 
	{
		impressao(); // chamada do m�todo.
		mensagem("Estamos estudando Programa��o Orientada a Objeto");// chamada do m�todo.
		System.out.println("O dobro do n�mero �: " + dobro(20));// chamada do m�todo.
		System.out.println("O resultado �: " + calcular(2.3,1.5));// chamada do m�todo.
		System.out.println("O resultado �: " + calcular(2,1));// chamada do m�todo.
		System.out.println("O resultado �: " + calcular(2,1,5));// chamada do m�todo.
		
		double[] notas = {8.9, 7.4, 5.6, 9};
		System.out.println(notas.length);		
		System.out.println("A m�dia das notas �: " + calcular(notas)); // chamando o argumento do array de double.
		System.out.printf("%s %.1f %n", "A m�dia das notas �: ", calcular(notas));
		System.out.println("O fatorial �: " + fatorial(8));// chamando o fatorial. 
	}
	
	// m�todo sem retorno e SEM passagem de par�metro: 
	public static void impressao() {
		System.out.println("Java � lindo!");
	}
	
	// m�todo sem retorno mas COM passagem de par�metro:
	public static void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// m�todo com retorno: significa que quando executado ele ir� devolver um valor.
	public static int dobro(int numero) {
		return numero * 2;
	}
	
	// sobrecarga de m�todos: tamb�m chamado de polimorfismo.
	public static double calcular(double num1, double num2) {
		return num1 + num2;
		
	}
	
	public static int calcular(int num1, int num2) { // dois m�todos com o mesmo nome, pq a assinatura � diferente "double" e "int".
		return num1 + num2;
	}
	
	public static int calcular(int num1, int num2, int num3) { // mesmo m�todo mas com tr�s argumentos.
		return num1 + num2 + num3;
	}
	
	public static double calcular(double[] numeros) { // iniciando array ou vetor.
		double soma = 0;
		
// 		   numeros = [2, 4, 6, 8, 10];
// posi��es no vetor  0  1  2  3  4
		
//		for(int i = 0; i < numeros.length; i++) { // FOR vai percorrer o vetor.
//			soma += numeros[i];
//		}
			
		for(double n:numeros) { // outro tipo de FOR para percorrer o vetor.
			soma += n; // ou soma = soma + n;
		}
		return soma/numeros.length;
	}
	
	// fatorial : 5! = 5x4x3x2x1 = 120;
	public static int fatorial(int numero) {
		int fatorial = 1;// armazenamento da multiplica��o.
		for(int contador = numero; contador > 0; contador--) {
			fatorial *= contador; // ou fatorial = fatorial * contador;
		}
		return fatorial;
	}
	
	
}