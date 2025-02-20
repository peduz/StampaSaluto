package ciclabile;

public class Ciclabile {
    /*
     * Vogliamo realizzare una classe che contenga un elenco di interi e che ci 
     * permetta di ciclarli (dal primo all’ultimo).
     * Dovrà offrire due metodi :
        - int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto 
            all’ultima volta che è stato invocato. Cioè la prima volta restituisce 
            il primo elemento, la seconda volta il secondo, …)

        - boolean hasAncoraElementi() (che deve restituire true se ci sono ancora 
            elementi da restituire)

        La classe deve avere un costruttore che prende come parametro un array di 
            interi (che sarà l’elenco che viene gestito internamente)
        Internamente alla classe vogliamo mantenere l’elenco di interi come array, 
        no ArrayList o simili.
        
        Bonus :
        prevedere anche un costruttore che non prenda parametri e un metodo 
        addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
     */

     private final int[] elenco;

     private int indice;

     private int indiceScrittura;

     public Ciclabile(int [] elenco) {
        this.elenco = elenco;
     }

    public Ciclabile() {
        this.elenco = new int[10];
    }

    void addElemento(int elemento) {
        if(indiceScrittura < elenco.length) {
            this.elenco[indiceScrittura] = elemento;
            indiceScrittura++;
        } else {
            System.out.println("Elenco completo");
        }
    }

     int getElementoSuccessivo() {
        if(hasAncoraElementi()) {
            int valore = elenco[indice];
            indice++;
            return valore;
        } else {
            return -1;
        }
     }

     boolean hasAncoraElementi() {
        if(indice < elenco.length) {
            return true;
        } else {
            return false;
        }
     }


}
