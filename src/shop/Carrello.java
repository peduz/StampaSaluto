package shop;

import java.util.Scanner;

public class Carrello {
    /*
     * Create una classe Carrello con metodo main, 
     * in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
     * 
     * Durante la richiesta di valorizzazione chiedete all’utente 
     * se sta inserendo 
     * uno Smarphone 
     * un Televisore 
     * Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
     * 
     * Al termine dell’inserimento stampate il carrello 
     * (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
     */
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Decidere quale prodotto valorizzare "
         + "(1 per Televisore, 2 per Cuffie, 3 per Smartphone)");

        int scelta = scan.nextInt();

        Prodotto prodotto = null;

        switch (scelta) {
            case 1:
                System.out.println("Quanti pollici ha la TV?");
                double pollici = scan.nextDouble();
                System.out.println("é smart? (1 se si, 2 se no)");
                int sceltaSmart = scan.nextInt();
                boolean smart = false;
                if(sceltaSmart == 1)  {
                    smart = true;
                }
                prodotto = new Televisore(pollici, smart);
                
                break;
            case 2:
                scan.nextLine();
                System.out.println("Inserisci il colore delle cuffie");
                String colore = scan.nextLine();

                System.out.println("Le cuffie sono wireless (y/n) ?");
                String sceltaWireless = scan.nextLine();
                boolean wireless = false;
                if(sceltaWireless.equalsIgnoreCase("y")) {
                    wireless = true;
                }
                prodotto = new Cuffie(colore, wireless);
                break;
            case 3:
                scan.nextLine();
                System.out.println("Inserisci il codice IMEI");
                String imei = scan.nextLine();
                System.out.println("Quanti giga di memoria ha?");
                double memoria = scan.nextDouble();
                prodotto = new Smartphone(imei, memoria);
                break;
            default:
                System.out.println("Scelta non corretta");
        }

        buildProdotto(prodotto);
        System.out.println(prodotto);
    }


    private static void buildProdotto(Prodotto prodotto) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci l'iva");
        double iva = scan.nextDouble();
        prodotto.setIva(iva);

        scan.nextLine();
        System.out.println("Inserisci il nome");
        String nome  = scan.nextLine();
        prodotto.setNome(nome);
        
        System.out.println("Inserisci il prezzo");
        double prezzo = scan.nextDouble();
        prodotto.setPrezzo(prezzo);
    }
}
