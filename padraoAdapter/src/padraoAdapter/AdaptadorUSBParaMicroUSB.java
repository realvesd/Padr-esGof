package padraoAdapter;


//Classe adaptador (Adapter)
class AdaptadorUSBParaMicroUSB extends SensorUSB {

  private SensorMicroUsb adaptee;

  public AdaptadorUSBParaMicroUSB(SensorMicroUsb adaptee) {
      this.adaptee = adaptee;
  }

  //Override da solicitação
  public void conectarUSB() {
      adaptee.conectarMicroUsb();
      System.out.println("Conexão com Micro USB feita");
  }
}
