package staticAuto;

import java.util.Random;

public abstract class Auto implements Mobile, Stoppable {

    /*
     * Contatore di Auto
        Crea una classe Auto con:
        - Un numero di telaio (final int numeroTelaio) univoco assegnato 
            automaticamente alla creazione.
        - Una variabile static int contatoreAuto per tenere traccia 
            del numero totale di auto create.
        - Un modello (final String modello) assegnato al momento della creazione e non modificabile.

        Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di 
        telaio deve essere assegnato in modo incrementale.
        Implementa un metodo static int getNumeroTotaleAuto() che restituisca 
        il numero totale di auto create.
     */

     private final int numeroTelaio;

     private static int contatoreAuto;

     private static int currentNumeroTelaio;

     private final String modello;

     protected String nome;

     public Auto(String modello) {
        this.modello = modello;
        Random ran = new Random();
        if(currentNumeroTelaio == 0) {
            currentNumeroTelaio = ran.nextInt();
            System.out.println("Il numero telaio corrente è " + currentNumeroTelaio);
        }
        numeroTelaio = currentNumeroTelaio++;
        System.out.println("Il numero telaio modificato è " + currentNumeroTelaio);
        contatoreAuto++;
     }

     public static int getNumeroTotaleAuto() {
        //getModello(); // NO
        /*
         * Auto auto = new Auto("auto");
         * auto.getModello(); SI 
        */  
        return contatoreAuto;
     }

    public String getModello() {
        return modello;
    }

     public int getNumeroTelaio() {
        return numeroTelaio;
     }

     protected String getNome() {
        return nome;
     }
}
