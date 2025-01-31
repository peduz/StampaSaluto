public class Rettangolo {
    
    private int base;

    private int altezza;

    public Rettangolo(int base, int altezza) {
        setBase(base);
        setAltezza(altezza);
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setBase(int base) {
        if(base <= 0) {
            System.out.println("La base può essere 0, do un valore di default (10)");
            this.base = 10;
        } else {
            this.base = base;
        }
    }

    public void setAltezza(int altezza) {
        if(altezza <= 0) {
            System.out.println("L'altezza può essere 0, do un valore di default (10)");
        } else {
            this.altezza = altezza;
        }
    }
    int calcolaArea() {
        return getBase() * getAltezza();
    }

    int perimetro() {
        return (base*2) + (altezza*2);
    }
}
