package fundamentos;

public class TiposPrimitivos 
{ 
	
	public static void main(String[] args) 
	{
// informações do funcionario

// tipos numericos inteiros
	 byte anosDeEmpresa = 30;
	 short numeroDeVoos = 543;
	 int id = 56_789;
	 long pontosAcumulados = 3_134_845_223L;
	 
// tipos numericos reais " tipos flutuantes" ( com casas decimais ) 
	 float salario = 11_445.44F;
	 double vendasAcumuladas = 2_991_797_103.01;
	 
// tipo booleano - false ou true
	 boolean estaDeFerias = true;
	 
// tipo caractere
	 char status = 'A'; // ativo 

// dias de empresa
	 System.out.println("quantos anos de empresa : " + anosDeEmpresa * 365);
	 
// numero de viagens
	 System.out.println("qual o numero de boos : " + numeroDeVoos / 2);
	 
	 System.out.println(pontosAcumulados / vendasAcumuladas);
	 
	 System.out.println(id + " ganha --> " + salario);
	 
	 System.out.println("ferias ?: " + estaDeFerias);
	 
	 System.out.println("status: " + status);
	}
}
