

public class Automobile {
    
    private String colore;

    private int numeroPorte;

    private String motore;

    private String marca;

    private int cilindrata;

    private String alimentazione;

    private String categoria;

    private boolean cambioAutomatico;

    private int numeroCavalli;

    private String modello;

    private int numeroPosti;

    private String targa;

    public Automobile() {
         System.out.println("Ciao");
         cambioAutomatico = false;
     }

    public Automobile(String marca) {
        this.marca = marca;
    }
    
    public Automobile(String targa, String marcaDaInizializzare) {
        this(marcaDaInizializzare);
        this.targa = targa;
    }
    
    public Automobile(int numeroCavalli) {
        this.numeroCavalli = numeroCavalli;
    }

    public Automobile(String targa, int numeroCavalli, int numeroPorte, String modello) {
        this(numeroCavalli);
        //....
    }

    public void parti() {
        System.out.println("Motore in accensione...");
    }

    public void parti(String tipoAccensione) {
        if(tipoAccensione == null) {
           parti();
        } else {
            System.out.println("Motore acceso con accensione " + tipoAccensione);
        }
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

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNumeroCavalli() {
        return numeroCavalli;
    }

    public void setNumeroCavalli(int numeroCavalli) {
        this.numeroCavalli = numeroCavalli;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
