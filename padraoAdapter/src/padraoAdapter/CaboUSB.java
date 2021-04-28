package padraoAdapter;

//Classe Cliente(Client)
public class CaboUSB {

  private SensorUSB sensorAQueSeConecta;
  
  public void Conectar(SensorUSB sensor){
      this.sensorAQueSeConecta = sensor;
      sensorAQueSeConecta.conectarUSB();
  }
}
