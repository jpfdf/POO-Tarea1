public class TestStage1{
    static int redTime;
    static int tiempoEjecucion;
    static int contadorrojo = 0;
    public TestStage1(int N, int redTime){
        tiempoEjecucion = N;
        this.redTime = redTime;
    }
    public static void main(String[] args){                                                              // 
        if (args.length != 2){
            System.out.println("ERROR\nUsage: java TestStage1 t[s] red_time\n" );                    // Error message in case of having more os less arguments than required
            return;
        }
        Semaforo3 semaforo = new Semaforo3(1);
        TestStage1 TSTG = new TestStage1(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
        int segundos = semaforo.getGreenTime();
        for(int i=0 ; i<tiempoEjecucion ; i++){                                                                   // i represents the time in seconds  
            if (semaforo.getColorActual()=="verde"){
                semaforo.manejarLuzActual();
                System.out.println("<" + i + ">     <2>" );
                contadorrojo = 0;
            }
            else if(semaforo.getColorActual()=="amarillo"){
                semaforo.manejarLuzActual();
                System.out.println("<" + i + ">     <1>" );
                contadorrojo = 0;
            }
            else if(semaforo.getColorActual()=="rojo"){
                semaforo.manejarLuzActual();
                System.out.println("<" + i + ">     <0>");
                contadorrojo ++;
                if (contadorrojo == redTime){
                    semaforo.turnGreenLightOn();
                }
            }
        }        
    }
}