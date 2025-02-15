package template;

public abstract class AbstractTemplate {

    public abstract String getNomeUtente();
    
    public abstract String getCognomeUtente();
    
    public abstract String getStatoUtente();
    
    public void stampaDatiUtente() {
        System.out.println("Ciao " + getNomeUtente() + " " + getCognomeUtente() 
        + " come stai?");

        if(getStatoUtente().equalsIgnoreCase("bene")) {
            System.out.println("Sono contento!");
        } else {
            System.out.println("Mi dispiace!");
        }
    }
}
