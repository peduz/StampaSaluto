package animali;

public class Gatto extends Felino {
    
    private String nome;
    
    private String razza;

    private boolean infame;

    private int tendeDistrutte;

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public boolean isInfame() {
        return infame;
    }

    public void setInfame(boolean infame) {
        this.infame = infame;
    }

    public int getTendeDistrutte() {
        return tendeDistrutte;
    }

    public void setTendeDistrutte(int tendeDistrutte) {
        this.tendeDistrutte = tendeDistrutte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
