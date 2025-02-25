package exProva;

import ExProva.EsercizioEccezione;
import java.util.Scanner;

public class UsaEsercizioEccezione {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Inserisci un numero > 10");
            int numero = scan.nextInt();
            int numTentativi = 0;
            while(numero < 10 && numTentativi < 3) {
            System.out.println("Inserisci un numero > 10");
                numero = scan.nextInt();
                numTentativi++;
            }
            EsercizioEccezione ex = new EsercizioEccezione(numero);
            System.out.println(ex.getNumero());
        } catch (Exception e) {
            System.err.println("Errore " + e);
        }

    }
}
