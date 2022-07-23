package PagamentoImpostos;
// subclasse:
public class PessoaFisica extends Pessoa{

	private double gastosComSaude;
	
	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		
		if(this.getRendaAnual() < 20000) {
			imposto = getRendaAnual() * 0.15; // aqui não precisa colocar o "this."
		}else {
			imposto = getRendaAnual() * 0.25; // aqui não precisa colocar o "this."
		}
		if(this.gastosComSaude > 0) {
			imposto = imposto - 0.50 * this.gastosComSaude;
// ou 		imposto -= this.gastosComSaude * 0.50;			
		}
		return imposto;								
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

}
