package padraoObserver;

public class MensagemSubscriberTres implements Observador{
    @Override
    public void update(Mensagem m) {
        System.out.println("MensagemSubscriberTres :: " + m.getMessageContent());
    }

	
}

