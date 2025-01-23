
import java.util.Scanner;

public class Interazione {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserisci due numeri interi");
        int numero = scan.nextInt();
        int numero2 = scan.nextInt();
        
        System.out.println("La somma dei numeri è " + (numero + numero2));
        
        // System.out.println("inserisci un numero con virgola");
        // double numVirgola = scan.nextDouble();
        
        // System.out.println(numVirgola);
        
        String vuoto = scan.nextLine();
        System.out.println("La riga è vuota " + vuoto);
        System.out.println("Inserisci il tuo nome ");
        String nome = scan.nextLine();
        System.out.println("Ciao " + nome);
    }
}
