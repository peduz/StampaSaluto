package mobili;

public class Tavolo extends ProdottoLavorato {
    
    private Dimensioni dimensioni;

    private Gambe gambe;

    private int numeroGambe;

    public void stampaComponenti() {
        System.out.println("Il tavolo è composto dalle gambe " + gambe 
            + ", ha dimensioni " + dimensioni + ", e ha " + numeroGambe + " gambe" );
    }

    public Dimensioni getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(Dimensioni dimensioni) {
        this.dimensioni = dimensioni;
    }

    public Gambe getGambe() {
        return gambe;
    }

    public void setGambe(Gambe gambe) {
        this.gambe = gambe;
    }

    public int getNumeroGambe() {
        return numeroGambe;
    }

    public void setNumeroGambe(int numeroGambe) {
        this.numeroGambe = numeroGambe;
    }

}
