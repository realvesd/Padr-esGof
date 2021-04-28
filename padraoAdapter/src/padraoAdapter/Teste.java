package padraoAdapter;

public class Teste{
	
public static void main(String[] args) {
    
    //Tem-se um Xbox2 e mas deseja-se usar um controle ps5:
    SensorMicroUsb adaptee = new SensorMicroUsb();
    CaboUSB target = new CaboUSB();
    
    //Cria-se um falso sensor de PS5 que, na verdade, traduz e repassa os comandos para o Xbox em questão:
    AdaptadorUSBParaMicroUSB adapter = new AdaptadorUSBParaMicroUSB(adaptee);
    
    //Conecta-se o controle ao adapter:
    target.Conectar(adapter);
}
}
