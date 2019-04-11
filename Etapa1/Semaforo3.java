public class Semaforo3{
    private boolean luzVerde;
    private boolean luzAmarilla;
    private boolean luzRoja;
    private int tiempoVerde;
    private int contadorVerde;
    private int contadorAmarillo;
    static int tiempoAmarillo = 3;           // STATIC es una variable que no se puede cambiar ni definir en otro lado

    public Semaforo3(int greenTime){
        luzVerde = false;
        luzAmarilla = true;
        luzRoja = false;                      // El semaforo parte inicialmente con luz roja
        tiempoVerde = greenTime;
    }

    public void turnRedLightOn(){
        if (luzVerde){
            luzVerde = false;
        }
        if (luzAmarilla){
            luzAmarilla = false;
        }
        if (!luzRoja){
            luzRoja = true;
        }
    }

    public void turnYellowLightOn(){
        if (luzVerde){
            luzVerde = false;
        }
        if (luzRoja){
            luzRoja = false;
        }
        if (!luzAmarilla){
            luzAmarilla = true;
            contadorAmarillo = 0;
        }
    }
    public void turnGreenLightOn(){
        if (luzRoja){
            luzRoja = false;
        }
        if (!luzVerde){
            luzVerde = true;
            contadorVerde = 0;
        }
    }
    public int getGreenTime(){
        return tiempoVerde;
    }
    public static int getYellowLightTime(){
        return tiempoAmarillo;
    }
    public String toString(){
        return "a";
        // Por terminar ?
    }
    public void manejarLuzActual(){
        if(luzVerde){
            contadorVerde ++;
            if(contadorVerde == tiempoVerde){
                turnYellowLightOn();
            }
        }
        else if(luzAmarilla){
            contadorAmarillo ++;
            if(contadorAmarillo == tiempoAmarillo){
                turnRedLightOn();
            }
        }
    }

    public String getColorActual(){
        if(luzVerde){
            return "verde";
        }
        else if(luzAmarilla){
            return "amarillo";
        }
        else if(luzRoja){
            return "rojo";
        }
        return "0";
    }
}