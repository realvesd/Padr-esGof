package padraoStrategy;

public class Teste {
	
	public static void main(String[] args) {
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		ICMS icms = new ICMS(100.00);
		IPI ipi = new IPI(100.00);
		System.out.println("ICMS: " + calculadora.calcular(icms));
		System.out.println("IPI: " + calculadora.calcular(ipi));
	}

}
