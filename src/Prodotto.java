
import java.util.Random;

public class Prodotto {
    

    /*
     * Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
     */

     public int codice;

     public String nome;

     public String descrizione;

     public double prezzo;

     public double iva;

     public Prodotto(String nome, double prezzo, double iva) {
        calcolaCodice();
        if(nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Impossibile dare un nome null al prodotto");
        }
        if(prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Impossibile impostare un prezzo minore o uguale a 0");
        }
        if(iva == 1.04 || iva == 1.1 || iva == 1.22) {
            this.iva = iva;
        } else {
            System.out.println("Impossibile impostare l'iva a valori diversi da 4%, 10% o 22%");
        }
     }

     public void calcolaCodice() {
        Random ran = new Random();
        this.codice = ran.nextInt(1000, 100000);
     }

     public double getPrezzoBase() {
        return this.prezzo;
     }

     public double getPrezzoIva() {
        return this.prezzo * this.iva;
     }

     public String getNomeEsteso() {
        return this.codice + "-" + this.nome;
     }


     public double sommaTotale(double... numbers) {
        double somma = 0;
        for(int i = 0; i < numbers.length; i++) {
            somma += numbers[i];
        }
        return somma;
     }

}
