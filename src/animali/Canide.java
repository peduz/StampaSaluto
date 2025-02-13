package animali;

public abstract class Canide extends Mammifero {
    
    private boolean domestico;

    private String razza;

    private boolean daRiporto;

    private boolean daCaccia;

    private String taglia;

    // public Canide(double peso) {
    //     super(peso);
    // }

    public Canide(double peso, String razza) {
        super(peso);
        this.razza = razza;
    }

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

    @Override
    public String toString() {
        return  super.toString() 
                + ", domestico=" + domestico + ", razza=" + razza 
                + ", daRiporto=" + daRiporto 
                + ", daCaccia=" + daCaccia + ", taglia=" + taglia;
    }


}
