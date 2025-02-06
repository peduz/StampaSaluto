package animali;

public class Felino extends Mammifero {

    private int lunghezzaArtigli;

    private String taglia;

    private boolean predatore;

    private boolean selvatico;

    private int lunghezzaBaffi;

    public Felino(double peso) {
        super(peso);
    }

    public int getLunghezzaArtigli() {
        return lunghezzaArtigli;
    }

    public void setLunghezzaArtigli(int lunghezzaArtigli) {
        this.lunghezzaArtigli = lunghezzaArtigli;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public boolean isPredatore() {
        return predatore;
    }

    public void setPredatore(boolean predatore) {
        this.predatore = predatore;
    }

    public boolean isSelvatico() {
        return selvatico;
    }

    public void setSelvatico(boolean selvatico) {
        this.selvatico = selvatico;
    }

    public int getLunghezzaBaffi() {
        return lunghezzaBaffi;
    }

    public void setLunghezzaBaffi(int lunghezzaBaffi) {
        this.lunghezzaBaffi = lunghezzaBaffi;
    }

    

}
