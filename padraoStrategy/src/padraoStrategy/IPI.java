package padraoStrategy;

public class IPI implements Imposto {

	private double valor;
	
	
	
	
	public IPI(double valor) {
		super();
		this.valor = valor;
	}




	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return this.valor * 0.20;
	}

}
