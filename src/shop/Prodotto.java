package shop;

import java.util.Random;

public class Prodotto {
    /*
     * Creare la classe Prodotto che gestisce i prodotti dello shop. 

        Un prodotto è caratterizzato da:
        - codice (numero intero)
        - nome
        - marca
        - prezzo
        - iva

        Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
            ed eventuali altri metodi di “utilità” per fare in modo che:
        - il codice prodotto sia accessibile solo in lettura
        - gli altri attributi siano accessibili sia in lettura che in scrittura
     */
     private int codice;
     private String nome;
     private double prezzo;
     private double iva;

    public Prodotto() {
        this.codice = buildCodice();
    }

    private int buildCodice() {
        Random ran = new Random();

        return ran.nextInt(1000, 10000000);
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Il prodotto ha codice=" + codice 
                + ", nome=" + nome + ", prezzo=" + prezzo 
                + ", iva=" + iva;
    }
}
