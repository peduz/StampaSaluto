package animali;

public class Tigre extends Felino {
    
    private String nome;
    
     private String provenienza;

     private String sesso;

     private boolean albino;

    public Tigre(double peso) {
        super(peso);
    }

    @Override
    public void faiVerso() {
        // System.out.println("Ruggisce");
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public boolean isAlbino() {
        return albino;
    }

    public void setAlbino(boolean albino) {
        this.albino = albino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     

}
