public class DetectorDeRequerimiento{
  private volatile boolean Apretado;
  
  public DetectorDeRequerimiento(){};
  
  public boolean isON(){
    return Apretado;
  }
  public void setON(){
    Apretado = true;
  }
  public void setOff(){
    Apretado = false;
  }    
  public String toString(){
    if(Apretado){
      return "El boton esta apretado";
    }
    else{
      return "El boton no esta apretado";
    }
  }    
}
  