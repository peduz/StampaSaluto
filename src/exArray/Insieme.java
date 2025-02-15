package exArray;

public class Insieme {
    /*
     * Scrivere una classe chiamata Insieme che contiene un private int[] insieme 
     * ed espone i seguenti metodi
     * 
     * Insieme intersezione(Insieme altroInsieme) ritorna l'intersezione tra this.insieme 
     * e altroInsieme.insieme
     * 
     * Insieme unione(Insieme altroInsieme) ritorna l'unione tra this.insieme 
     * e altroInsieme.insieme
     * 
     * Insieme differenza(Insieme altroInsieme) ritorna la differenza ...
     * 
     * E' importante notare che la classe Insieme per ogni suo metodo 
     *   ritorna una nuova istanza di se stessa.
     */

    private int[] insieme;

    public Insieme(int... insieme) {
        this.insieme = insieme;
    }

     Insieme intersezione(Insieme altroInsieme) {
        int size = insieme.length > altroInsieme.insieme.length ?
                        altroInsieme.insieme.length : insieme.length; 

        int [] intersezione = new int [size];

        //this.insieme          =   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //altroInsieme.insieme  =   {24, 2, 5, 67, 12, 87, 3}

        int count = 0;
        
        for(int i = 0; i < this.insieme.length; i++) {
            System.out.print("Iterazione i: " + i);
            for(int j = 0; j < altroInsieme.insieme.length; j++) {
                System.out.println("    Iterazione j: " + j);
                if(altroInsieme.insieme[j] == this.insieme[i]) {
                    intersezione[count] = altroInsieme.insieme[j];
                    count++;
                }
            }
        }

        return new Insieme(intersezione);
     }

     Insieme unione(Insieme altroInsieme) {

        return null;
     }

     Insieme differenza(Insieme altroInsieme) {
        return null;
    }

     void stampaInsieme() {
        for (int i = 0; i < this.insieme.length; i++) {
            System.out.println("Pos " + i + " val " + this.insieme[i]);
        }
    }
}
 