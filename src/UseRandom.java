import java.util.Random;

public class UseRandom {
    
    public static void main(String[] args) { 
        
        Random ran = new Random();
        int max = 10;

        int casuale = ran.nextInt(max);
        System.out.println(casuale);
    }
}
