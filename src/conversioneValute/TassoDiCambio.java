package conversioneValute;

public class TassoDiCambio {
    
    private String valutaPartenza;

    private String valutaArrivo;

    private double tassoDiCambio;

    public TassoDiCambio(String valutaPartenza, String valutaArrivo, double tassoDiCambio) {
        this.valutaPartenza = valutaPartenza;
        this.valutaArrivo = valutaArrivo;
        this.tassoDiCambio = tassoDiCambio;
    }

    public String getValutaPartenza() {
        return valutaPartenza;
    }

    public String getValutaArrivo() {
        return valutaArrivo;
    }

    public double getTassoDiCambio() {
        return tassoDiCambio;
    }


}
