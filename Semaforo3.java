

public class Semaforo3{

    private boolean luzVerde;
    private boolean luzAmarilla;
    private boolean luzRoja;
    private int tiempoVerde;
    static int tiempoAmarillo = 3;

    public Semaforo3(int greenTime){
        
        luzVerde = false;
        luzAmarilla = false;
        luzRoja = true;
        tiempoVerde = greenTime;

    }

    public void turnRedLightOn(){


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

        if (!luzAmarilla){

            luzAmarilla = true;

        }


    }

        public void turnGreenLightOn(){

        if (!luzVerde){

            luzVerde = true;

        }

        if (luzRoja){
            
            luzRoja = false;

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

    public String getColorActual(){

        if(luzVerde){

            return "verde";

        }
        if(luzAmarilla){

            return "amarillo";

        }
        if(luzRoja){

            return "rojo";

        }
        return "0";

    }






    




}