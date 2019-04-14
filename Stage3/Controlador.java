import javax.swing.Timer;

public class Controlador extends Thread{
  private SemaforoDeGiro Sgiro;
  private DetectorDeRequerimiento SensorInductivo;
  private boolean primerciclo = true;
  
  public Controlador(DetectorDeRequerimiento sensInd, SemaforoDeGiro semg) {
    SensorInductivo=sensInd;
    Sgiro=semg;
  }
  
  public void manageTraffic(){  
    int GreenLightTime1 = Sgiro.getGreenLightTime();
    int blinkingTime1 = Sgiro.getBlinkingTime();
    //System.out.println(boton1.toString());
    if (SensorInductivo.isON()){                                                                          // Si se aprieta el boton se pone en verde y se queda asi por GreenLightTime1 segundos
      Sgiro.turnGreenLightOn();                                                                      
      try{Thread.sleep(GreenLightTime1*1000);}catch(InterruptedException e){System.out.println(e);}
    }
    if (Sgiro.toString().equals("La luz esta encendida")){                                    // Pasados esos segundos, este if se ejecuta iniciando el des verdado
      Sgiro.turnParpadeandoLightOn();
      //Timer velParpadeo = new Timer(1000,Sgiro);                                              // Este Timer maneja la secuencia del parpadeo de la luz (prende y apaga cada 1 segundo)
      try{Thread.sleep(1000*blinkingTime1);}catch(InterruptedException e){System.out.println(e);}
      //velParpadeo.stop();*/
      Sgiro.turnGreenLightOff();                                                                 // Una vez termina de parpadear la luz se vuelve roja
    }
  }
}

