package mobili;
public class Dimensioni {
    
    private double lunghezza;

    private double altezza;

    private double profondità;

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getProfondità() {
        return profondità;
    }

    public void setProfondità(double profondità) {
        this.profondità = profondità;
    }

    @Override
    public String toString() {
        return "Dimensioni [lunghezza=" + lunghezza + ", altezza=" + altezza + ", profondità=" + profondità + "]";
    }

    
}
