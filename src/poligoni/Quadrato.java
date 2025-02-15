package poligoni;

public class Quadrato implements Poligono {

    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
        calcolaArea();
        calcolaPerimetro();
    }

    @Override
    public double calcolaArea() {
        return lato*lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato*4;
    }

    @Override
    public String toString() {
        return "L'area del quadrato è " + calcolaArea() 
            + ", il perimetro è " + calcolaPerimetro();
    }
    
}
