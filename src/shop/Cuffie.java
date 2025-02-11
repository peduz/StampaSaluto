package shop;

public class Cuffie extends Prodotto {
    
    /*
     *   Lo shop gestisce diversi tipi di prodotto: 
        - Cuffie, caratterizzate dal colore e se sono wireless o cablate

        Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura 
        delle classi che gestiscono i vari sotto tipi di prodotto.
     */

     private String colore;

     private boolean wireless;

    public Cuffie(String colore, boolean wireless) {
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        String wireless = isWireless() ? " sono wireless " : " sono wired ";
        return "Le cuffie sono di colore " + getColore() + wireless 
                + ", hanno codice " + getCodice() 
                + ", si chiamano " + getNome() 
                + ", hanno un prezzo di " + getPrezzo() + ", e iva di " + getIva();
    }
}
