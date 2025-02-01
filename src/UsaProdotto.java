public class UsaProdotto {
    
    public static void main(String [] args) {
        Prodotto prodotto = new Prodotto("Cuffie", 35.5, 1.22);

        System.out.println(prodotto.codice);

        System.out.println("Il nome esteso è " + prodotto.getNomeEsteso());

        System.out.println(String.format("Il prezzo base è %f, e quello con iva è %f ", 
        prodotto.getPrezzoBase(), prodotto.getPrezzoIva()));


        System.out.println("Il prezzo base è " 
                        + prodotto.getPrezzoBase() 
                        + ", e quello con iva è "
                        + prodotto.getPrezzoIva());

        double somma = prodotto.sommaTotale();
        System.out.println(somma);
        somma = prodotto.sommaTotale(1, 2, 3, 45, 34543, 324);
        System.out.println(somma);
    }
}
