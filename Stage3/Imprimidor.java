import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imprimidor implements ActionListener{
  private SemaforoDeGiro SG;
  private DetectorDeRequerimiento DDR;
  private SimuladorEntrada SE;
  private int contador =0;
  
  public Imprimidor (DetectorDeRequerimiento boton, SemaforoDeGiro giro, SimuladorEntrada SimE){
    SG=giro;
    DDR=boton;
    SE=SimE;
  }    
  
  public void actionPerformed(ActionEvent Event){        //En a llamada del Timer imprimidor imprime todo esto
    System.out.println("---------------------");
    System.out.println(contador);
    contador++;
    System.out.println(DDR.toString());
    System.out.println(SG.toString());
    System.out.println(SE.aunSimulando());
  }
}