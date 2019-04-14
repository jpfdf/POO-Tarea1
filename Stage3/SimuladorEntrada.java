import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimuladorEntrada implements ActionListener{
  private DetectorDeRequerimiento boton;
  private String archivo;
  private Scanner input;
  private boolean abierto = false;
  private boolean simulacionTerminada = false;

  public SimuladorEntrada(DetectorDeRequerimiento btn, String filename){
      boton = btn;
      archivo = filename;
  }
  public boolean aunSimulando(){                                  // Este busca que la simulacion acabe una vez se acaben las lineas del documento de entradas
      return !simulacionTerminada;
  }    
  public void actionPerformed(ActionEvent Event){                 // El evento es la llamada del timer leedor
    if (!simulacionTerminada){
      try {
        if (!abierto){                                            // Esto es para que el documento se abra una sola vez
          input = new Scanner(new File(archivo));
          abierto = true;
        }
        if (input.hasNextLine()) {                                // Cuando llega a la linea final se cierra
          String line = input.nextLine();
          if (line.equals("1")){                                  // Setea al boton si la linea es un uno
            boton.setON();
          }
          else{
            boton.setOff();
          }
        }
        else{
          input.close();
          simulacionTerminada = true;
        }
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}