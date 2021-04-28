package padraoObserver;

public interface Subject 
{
	public void add (Observador o);
	public void remove (Observador o);
	public void notifyUpdate (Mensagem m);
	
}
