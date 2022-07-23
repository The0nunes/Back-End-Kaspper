
public class Metodos {
// "public" é um modificador de acesso.
// "static" tira a obrigatoriedade de o metodo seja iniciado.
// "void" executa e não retorna nada.	
// "main" é a porta de entrada do programa.	
	
	public static void main(String[] args) 
	{
		impressao(); // chamada do método.
		mensagem("Estamos estudando Programação Orientada a Objeto");// chamada do método.
		System.out.println("O dobro do número é: " + dobro(20));// chamada do método.
		System.out.println("O resultado é: " + calcular(2.3,1.5));// chamada do método.
		System.out.println("O resultado é: " + calcular(2,1));// chamada do método.
		System.out.println("O resultado é: " + calcular(2,1,5));// chamada do método.
		
		double[] notas = {8.9, 7.4, 5.6, 9};
		System.out.println(notas.length);		
		System.out.println("A média das notas é: " + calcular(notas)); // chamando o argumento do array de double.
		System.out.printf("%s %.1f %n", "A média das notas é: ", calcular(notas));
		System.out.println("O fatorial é: " + fatorial(8));// chamando o fatorial. 
	}
	
	// método sem retorno e SEM passagem de parâmetro: 
	public static void impressao() {
		System.out.println("Java é lindo!");
	}
	
	// método sem retorno mas COM passagem de parâmetro:
	public static void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// método com retorno: significa que quando executado ele irá devolver um valor.
	public static int dobro(int numero) {
		return numero * 2;
	}
	
	// sobrecarga de métodos: também chamado de polimorfismo.
	public static double calcular(double num1, double num2) {
		return num1 + num2;
		
	}
	
	public static int calcular(int num1, int num2) { // dois métodos com o mesmo nome, pq a assinatura é diferente "double" e "int".
		return num1 + num2;
	}
	
	public static int calcular(int num1, int num2, int num3) { // mesmo método mas com três argumentos.
		return num1 + num2 + num3;
	}
	
	public static double calcular(double[] numeros) { // iniciando array ou vetor.
		double soma = 0;
		
// 		   numeros = [2, 4, 6, 8, 10];
// posições no vetor  0  1  2  3  4
		
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
		int fatorial = 1;// armazenamento da multiplicação.
		for(int contador = numero; contador > 0; contador--) {
			fatorial *= contador; // ou fatorial = fatorial * contador;
		}
		return fatorial;
	}
	
	
}