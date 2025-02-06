package mobili;

public class UsaMobili {
   
    public static void main(String[] args) {
        Dimensioni dimGambe = new Dimensioni();
        dimGambe.setAltezza(80);
        dimGambe.setLunghezza(5);
        dimGambe.setProfondità(5);

        Gambe gambe = new Gambe();
        gambe.setColore("Bianco");
        gambe.setDimensioni(dimGambe);


        Dimensioni dimTavolo = new Dimensioni();
        dimTavolo.setAltezza(10);
        dimTavolo.setLunghezza(140);
        dimTavolo.setProfondità(80);

        Tavolo tavolo = new Tavolo();
        tavolo.setColore("Bianco");
        tavolo.setDimensioni(dimTavolo);
        tavolo.setGambe(gambe);
        tavolo.setNumeroGambe(4);
        tavolo.setStile("Moderno");

        tavolo.stampaComponenti();
    }
}
