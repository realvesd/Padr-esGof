package padraoObserver;

public class Teste {

	public static void main(String[] args) {
		
		MensagemSubscriberUm s1 = new MensagemSubscriberUm();
        MensagemSubscriberDois s2 = new MensagemSubscriberDois();
        MensagemSubscriberTres s3 = new MensagemSubscriberTres();
         
        PublicarMensagem p = new PublicarMensagem();
         
        p.add(s1);
        p.add(s2);
         
        p.notifyUpdate(new Mensagem("Primeira Mensagem"));   //s1 e s2 receberao os updates
         
        p.remove(s1);
        p.add(s3);
         
        p.notifyUpdate(new Mensagem("Segunda Mensagem")); //s2 e s3 will receberao os updates
    }

}
