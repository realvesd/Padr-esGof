package padraoObserver;

public class MensagemSubscriberUm implements Observador {
    @Override
    public void update(Mensagem m) {
        System.out.println("MensagemSubscriberUm :: " + m.getMessageContent());
    }
}