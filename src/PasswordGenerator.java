
import java.util.Scanner;

public class PasswordGenerator {
    
    /*
     * Create un nuovo progetto java chiamato java-password-generator
        Aggiungete una classe PasswordGenerator che contiene un metodo main
        Il programma deve fare quanto segue:
        - chiedere all'utente e salvare in opportune variabili il
            - nome
            - cognome
            - colore preferito
            - data di nascita di un utente suddivisa in giorno, mese e anno in numero
        - generare (e stampare a video) una password concatenando nome, cognome, 
            colore preferito e somma di giorno, mese e anno di nascita, 
            separate dal carattere -
        Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
        La sua password sarà Pinco-Pallo-magenta-2011   
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire nome, cognome, colore preferito e data di nascita per generare una password.");

        //Stampiamo la singola richiesta e permettiamo l'inserimento a lato
        System.out.print("Inserire il nome: ");
        String nome = scan.nextLine();
        
        //Andiamo a capo
        System.out.println();

        //per inserire il cognome
        System.out.print("Inserire il cognome: ");
        String cognome = scan.nextLine();

        System.out.print("\nInserisci il tuo colore preferito: ");
        String colore = scan.nextLine();

        System.out.print("\nInserire il giorno di nascita: ");
        int giornoNascita = scan.nextInt();

        System.out.print("\nInserire il mese di nascita: ");
        int meseNascita = scan.nextInt();
        
        System.out.print("\nInserire l'anno di nascita: ");
        int annoNascita = scan.nextInt();

        String password = nome + "-" + cognome + "-" + colore + "-"
                        + (giornoNascita + meseNascita + annoNascita);

        System.out.println(String.format("\nLa tua password è %s", password));
    }
    
}
