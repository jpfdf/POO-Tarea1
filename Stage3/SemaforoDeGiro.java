import java.io.File;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SemaforoDeGiro/* implements ActionListener*/{
  private volatile boolean luzVerde = false;
  private volatile boolean luzParpadeando = false;
  private int tiempoParpadeo;
  private int tiempoVerde;
  
  public SemaforoDeGiro(int greenTime, int blinkingTime){
    tiempoParpadeo=blinkingTime;
    tiempoVerde=greenTime;
    }
  
  public void turnParpadeandoLightOn(){                     //Las proximas cuatro funciones setean luces en el semaforo
    luzVerde = false;
    luzParpadeando = true;
  }
    
  public void turnGreenLightOn(){
    luzVerde = true;
    luzParpadeando = false;
  }
  
  public void turnGreenLightOff(){                          // Esta en particular se usa para el parpadeo
    luzVerde = false;
    luzParpadeando = false;
  }
      
  public int getGreenLightTime(){
    return tiempoVerde;
  }
      
  public int getBlinkingTime(){
    return tiempoParpadeo;
  }
  /*
  public void actionPerformed(ActionEvent Event){        // Esta funcion es llamada por un timer que hace parpadear la luz
    if (luzVerde){
      turnGreenLightOff();
    }
    else{
      turnGreenLightOn();
    }
  }
  */
  public String toString(){
    if(luzVerde){
      return "La luz esta encendida";
    }
    if(luzParpadeando){
      return "La luz esta parpadeando";
    }
    return "La luz esta apagada";
  }
}





  
  