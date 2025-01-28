public class Automobile {
    
    public String colore;

    public int numeroPorte;

    public String motore;

    public String marca;

    public int cilindrata;

    public String alimentazione;

    public String categoria;

    public boolean cambioAutomatico;

    public int numeroCavalli;

    public String modello;

    public int numeroPosti;

    public String targa;

    public Automobile() {
         System.out.println("Ciao");
         cambioAutomatico = false;
     }

    public Automobile(String marca) {
        this.marca = marca;
    }

    public Automobile(int numeroCavalli) {
        this.numeroCavalli = numeroCavalli;
    }

    public Automobile(String targa, String marcaDaInizializzare) {
        this.targa = targa;
        this.marca = marcaDaInizializzare;
    }

    public Automobile(String targa, int numeroCavalli, int numeroPorte, String modello) {
        //....
    }

    public void parti() {
        System.out.println("Motore acceso");
    }

    public void spegni() {
        System.out.println("Motore spento");
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int nuovoNumeroPorte) {
        numeroPorte = nuovoNumeroPorte;
    }

    public int addNumeroCavalli(int cavalliDaAggiungere) {
        // numeroCavalli = numeroCavalli + cavalliDaAggiungere;
        numeroCavalli += cavalliDaAggiungere;
        return numeroCavalli;
    }

}
