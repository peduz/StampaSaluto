package shop;

public class Smartphone extends Prodotto {
    /*
     *   Lo shop gestisce diversi tipi di prodotto: 
        - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

        Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura 
        delle classi che gestiscono i vari sotto tipi di prodotto.
     */

     private String codiceIMEI;

     private double memoria;

    public Smartphone(String codiceIMEI, double memoria) {
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public String getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(String codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Lo smartphone ha codice imei = " + getCodiceIMEI() 
                + ", ha una memoria di " + getMemoria() + " GB, " 
                + ", con codice " + getCodice() + ", si chiama " + getNome() 
                + ", ha un prezzo di " + getPrezzo() + ", e iva di " + getIva();
    }
    
}
