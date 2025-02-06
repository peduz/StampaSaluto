package contenutiMultimediali;

public class Contenuto {
    
    private String titolo;

    String[] attori;    
    
    void riproduci() {
        System.out.println("Stai guardando " + titolo);
    }
    
    protected void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
}
