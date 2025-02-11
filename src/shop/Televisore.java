package shop;

public class Televisore extends Prodotto {
    /*
     *   Lo shop gestisce diversi tipi di prodotto: 
        - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

        Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura 
        delle classi che gestiscono i vari sotto tipi di prodotto.
     */

     private double pollici;

     private boolean smart;

    public Televisore(double pollici, boolean smart) {
        this.pollici = pollici;
        this.smart = smart;
    }

    public double getPollici() {
        return pollici;
    }

    public void setPollici(double pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        String smart = isSmart() ? " è smart " : " non è smart ";
        return "Il televisore ha " + getPollici() + " pollici, " + smart 
                + ", ha codice = " + getCodice()
                + ", si chiama " + getNome() + ", ha un prezzo di " + getPrezzo() 
                + ", e iva " + getIva();
    }
}
