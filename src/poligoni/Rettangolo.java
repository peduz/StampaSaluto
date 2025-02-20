package poligoni;

import java.util.Random;

public class Rettangolo implements Poligono, Comparable<Rettangolo> {

    private final int id;

    private final double altezza;

    private final double base;

    public Rettangolo(double altezza, double base) {
        id = new Random().nextInt(100, 150);
        System.out.println("L'id del rettangolo è " + id);
        this.altezza = altezza;
        this.base = base;
        calcolaArea();
        calcolaPerimetro();
    }

    @Override
    public final double calcolaArea() {
        double risultato = base*altezza;
        // System.out.println(risultato);
        return risultato;
    }

    @Override
    public final double calcolaPerimetro() {
        double risultato = base*2 + altezza*2;
        // System.out.println(risultato);
        return risultato;
    }

    @Override
    public int compareTo(Rettangolo rettangolo) {
        //si definisce il criterio di comparazione
        if(this.id == rettangolo.id) {
            return 0;
        } else if(this.id < rettangolo.id) {
            return -1;
        } else {
            return +1;
        }
    }
    
     @Override
     public String toString() {
         return "ID del rettangolo: " + id
         + "\n l'area è: " + calcolaArea() + ", il perimetro è: " + calcolaPerimetro();
     }
    
}
