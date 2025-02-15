package template;

import java.util.Scanner;

public class TastieraTemplate extends AbstractTemplate {

    private Scanner scan;
    
    public TastieraTemplate() {
        scan = new Scanner(System.in);
    }

    @Override
    public String getCognomeUtente() {
        System.out.println("Inserisci il cognome");
        return scan.nextLine();
    }

    @Override
    public String getNomeUtente() {
        System.out.println("Inserisci il nome");
        return scan.nextLine();
    }

    @Override
    public String getStatoUtente() {
        
        return scan.nextLine();
    }
    
}
