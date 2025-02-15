package poligoni;

public class TriangoloEquilatero extends Triangolo {

    public TriangoloEquilatero(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double calcolaPerimetro() {
        return getBase()*3;
    }

    @Override
    public String toString() {
        return "Il triangolo equilatero ha un area di: " + calcolaArea() 
                + ", e un perimetro di " + calcolaPerimetro();
    }

    
}
