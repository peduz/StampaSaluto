package exProva;

public class EsercizioEccezione {

    private int numero;

    public EsercizioEccezione(int numero) throws Exception {
        if(numero < 10) {
            throw  new Exception("Il numero deve essere maggiore di 10");
        } else {
            this.numero = numero;
        }
    }

    public int getNumero() {
        return numero;
    }

    
}
