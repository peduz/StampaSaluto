package staticAuto;

public class AutoSportiva extends Auto {

    public AutoSportiva(String modello) {
        super(modello);
    }

    @Override
    public void muovi() {
        System.out.println("Accelero facendo molto rumore");
    }

    @Override
    public void ferma() {
        System.out.println("Mi fermo coi freni");
    }
    
    
}
