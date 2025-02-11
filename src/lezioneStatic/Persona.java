package lezioneStatic;

public class Persona {
    
    public static String mondoDiProvenienza;

    private String nome;

    private String cognome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nome=").append(nome);
        sb.append(", cognome=").append(cognome);
        sb.append(", viene dal pianeta ").append(mondoDiProvenienza);
        sb.append('}');
        return sb.toString();
    }

    
}
