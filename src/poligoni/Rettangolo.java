package poligoni;

public class Rettangolo implements Poligono {

    private final double altezza;

    private final double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
        calcolaArea();
        calcolaPerimetro();
    }

    @Override
    public final double calcolaArea() {
        double risultato = base*altezza;
        System.out.println(risultato);
        return risultato;
    }

    @Override
    public final double calcolaPerimetro() {
        double risultato = base*2 + altezza*2;
        System.out.println(risultato);
        return risultato;
    }

    // @Override
    // public String toString() {
    //     return "L'area è: " + calcolaArea() + ", il perimetro è: " + calcolaPerimetro();
    // }
    
    
}
