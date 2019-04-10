

public class TestStage1{

    private int redTime;
    static int ciclos;

    public TestStage1(int N, int redTime){

        ciclos = N;
        this.redTime = redTime;

    }

    public static void main(String[] args){

        Semaforo3 semaforo = new Semaforo3(3);

        int segundos = semaforo.getGreenTime();

        for(int i=0 ; i<ciclos ; i++){

            if ( i % 3 == 0 ){

                if (semaforo.getColorActual()=="verde"){

                    semaforo.turnYellowLightOn();
                    System.out.println("<" + i + ">     <2>" );

                }
                else if(semaforo.getColorActual()=="amarillo"){

                    semaforo.turnRedLightOn();
                    System.out.println("<" + i + ">     <1>" );

                }
                else if(semaforo.getColorActual()=="rojo"){

                    semaforo.turnGreenLightOn();
                    System.out.println("<" + i + ">     <0>");

                }

            }
        }        
    }
}