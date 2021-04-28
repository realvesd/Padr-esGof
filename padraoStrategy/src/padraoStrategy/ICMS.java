package padraoStrategy;

public class ICMS implements Imposto {

	private double valor;
	
	
	
	public ICMS(double valor) {
		super();
		this.valor = valor;
	}



	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.valor * 0.10;
	}

}
