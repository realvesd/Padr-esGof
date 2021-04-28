package padraoObserver;

import java.util.ArrayList;
import java.util.List;

public class PublicarMensagem implements Subject {
	
	private List<Observador> observers = new ArrayList<>();

	@Override
	public void add(Observador o) {
		observers.add(o);
		
	}

	@Override
	public void remove(Observador o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Mensagem m) {
		for (Observador o: observers) {
			o.update(m);
		}
		
	}

}
