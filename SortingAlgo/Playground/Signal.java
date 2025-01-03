import java.util.*;
public class Signal {
    public static final String GREEN = "\u001b[32m";
    public static final String RED = "\u001b[31m";
    public static final String RESET = "\u001b[0m";
    public static void main(String[] args) {
        int signalLight = 5, distance = 7;
        
        int signal = 0, totalSignal =4;
        int totalTime = 0; 
        while(signal<totalSignal)
        {   
            totalTime += distance;
            int reminder =  totalTime % signalLight;
            int waitingTime = (reminder ==0)?0:signalLight - reminder ;
            totalTime += waitingTime;
            signal++;
        }

        totalTime+=distance;
        System.out.println("  ");
        System.out.println(GREEN+"Total time to travel is "+RESET+totalTime+RED+"sec."+RESET ); 
        System.out.println("  ");       
    }
}
