package animali;

public class Mammifero {
    
    private int numeroDiZampe;

    private boolean coda;

    private boolean marino;

    private String colorePelo;

    private boolean carnivoro;
    
    private double peso;

    public Mammifero(double peso) {
        this.peso = peso;
    }

    public void faiVerso() {
        System.out.println("Verso animale");
    }

    public int getNumeroDiZampe() {
        return numeroDiZampe;
    }

    public boolean isCoda() {
        return coda;
    }

    public boolean isMarino() {
        return marino;
    }

    public String getColorePelo() {
        return colorePelo;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setNumeroDiZampe(int numeroDiZampe) {
        this.numeroDiZampe = numeroDiZampe;
    }

    public void setCoda(boolean coda) {
        this.coda = coda;
    }

    public void setMarino(boolean marino) {
        this.marino = marino;
    }

    public void setColorePelo(String colorePelo) {
        this.colorePelo = colorePelo;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // @Override
    // public String toString() {
    //     return "numeroDiZampe=" + numeroDiZampe + ", coda=" + coda 
    //             + ", marino=" + marino + ", colorePelo="
    //             + colorePelo + ", carnivoro=" + carnivoro + ", peso=" + peso;
    // }
}
