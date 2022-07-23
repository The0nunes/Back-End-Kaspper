package PagamentoImpostos;
//subclasse:	
public class PessoaJuridica extends Pessoa{

	private int numfuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numfuncionarios) {
		super(nome, rendaAnual);
		this.numfuncionarios = numfuncionarios;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		
		if(this.numfuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		}
		else{
			imposto = getRendaAnual() * 0.20;
		}
		return imposto;
	}

	public double getFuncionarios() {
		return numfuncionarios;
	}

	public void setFuncionarios(int numfuncionarios) {
		this.numfuncionarios = numfuncionarios;
	}

	
}
