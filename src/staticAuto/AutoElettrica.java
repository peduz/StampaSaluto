package staticAuto;

public class AutoElettrica extends Auto {

    public AutoElettrica(String modello) {
        super(modello);
    }

    @Override
    public void muovi() {
        System.out.println("Accelero senza far rumore");
    }

    @Override
    public void ferma() {
        System.out.println("Mi fermo col tasto");
    }
    
    
}
