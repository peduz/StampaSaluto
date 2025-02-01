public class Esercizio4 {
    
    /*
     * scrivere una classe che nel main ha due while uno dentro l'altro, 
     * il while piu' interno deve generare un loop infinito
     */
    public static void main(String[] args) {

        int i = 0;
        while(i <= 10) {
            int a = 0;
            while(a <= 10) {
                System.out.println(a);
            }
            i++;
        }
    }
}
