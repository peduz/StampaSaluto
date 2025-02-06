package mobili;

public class Gambe extends ProdottoLavorato {
 
    private Dimensioni dimensioni;

    public Dimensioni getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(Dimensioni dimensioni) {
        this.dimensioni = dimensioni;
    }

    @Override
    public String toString() {
        return "Gambe [getDimensioni()=" + getDimensioni() + ", getMateriale()=" + getMateriale() + ", getStile()="
                + getStile() + ", getColore()=" + getColore() + "]";
    }
    
}
