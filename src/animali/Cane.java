package animali;

public class Cane extends Canide {

    private String nome;

    private boolean conChip;

    private boolean pedigree;
    
    private String tipoPelo;

    private boolean perdePelo;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + (pedigree ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cane other = (Cane) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pedigree != other.pedigree)
            return false;
        return true;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public boolean isConChip() {
        return conChip;
    }

    public void setConChip(boolean conChip) {
        this.conChip = conChip;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public boolean isPerdePelo() {
        return perdePelo;
    }

    public void setPerdePelo(boolean perdePelo) {
        this.perdePelo = perdePelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
