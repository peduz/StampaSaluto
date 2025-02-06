package animali;

public class Canide extends Mammifero {
    
    private boolean domestico;

    private String razza;

    private boolean daRiporto;

    private boolean daCaccia;

    private String taglia;

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public boolean isDaRiporto() {
        return daRiporto;
    }

    public void setDaRiporto(boolean daRiporto) {
        this.daRiporto = daRiporto;
    }

    public boolean isDaCaccia() {
        return daCaccia;
    }

    public void setDaCaccia(boolean daCaccia) {
        this.daCaccia = daCaccia;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }


}
