package contenutiMultimediali;

public class Serie extends Contenuto {
    
    int numeroDiEpisodi;

    public int getNumeroDiEpisodi() {
        return numeroDiEpisodi;
    }

    public void riproduciEpisodioCorrente() {
        riproduci();
    }
}
