package padraoObserver;

public class MensagemSubscriberDois implements Observador{
    @Override
    public void update(Mensagem m) {
        System.out.println("MensagemSubscriberDois :: " + m.getMessageContent());
    }

	
}

