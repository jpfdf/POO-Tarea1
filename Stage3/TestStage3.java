import javax.swing.Timer;

public class TestStage3{
  static int redTime;
  static int tiempoEjecucion;
  static int contadorrojo = 0;
  private String rutaTexto;
  
  public TestStage3(String T){
    rutaTexto = T;
  }
  
  public static void main(String[] args){                                                      // Se declaran las clases
    TestStage3 TSTG = new TestStage3(args[0]);
    SemaforoDeGiro SG = new SemaforoDeGiro(5,10);
    DetectorDeRequerimiento DDR = new DetectorDeRequerimiento();
    Controlador CTRL = new Controlador(DDR,SG);
    SimuladorEntrada SE = new SimuladorEntrada(DDR,"/home/alumnos/jose.fuenzalida.13/POO/Tarea1/Stage3/acciones.txt");
    Imprimidor I = new Imprimidor(DDR,SG,SE);
    
    Timer leedor = new Timer(1000,SE);                                                        // Estos timers actuan en paralelo al codigo, uno lee el otro imprime en pantalla
    leedor.start();
    Timer imprimidor = new Timer(1000,I);
    imprimidor.start();
    
    while (SE.aunSimulando()==true){                                                          // Este ciclo es para que el controlador maneje al semaforo
      if (SE.aunSimulando()==false){System.out.println("lsadlaf");}                           // ACA COMO QUE NO EVALUA LA FUNCION SE.aunSimulando() Y NO SE POR QUE
      CTRL.manageTraffic();                                                                   // SE QUEDA PA SIEMPRE EN EL WHILE Y NO MANEJA EL TRAFICO NI NADA.
    }                                                                                         // SE ARREGLA PONIENDOLE UN System.out.println("ALGO")
    imprimidor.stop();
    leedor.stop();
  }
}