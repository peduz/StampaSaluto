


public class UsaAutomobile {
    
    public static void main(String[] args) {

        Automobile porsche = new Automobile("Porsche");
        porsche.setNumeroPorte(5);
        porsche.setModello("GT3");
        porsche.setTarga("IT000OO");
        porsche.setNumeroCavalli(300);
        System.out.println("Il numero di porte è: " + porsche.getNumeroPorte());

        System.out.println("La marca è " + porsche.getMarca());
        System.out.println("L'auto ha " + porsche.getNumeroCavalli() + " cavalli");
        porsche.addNumeroCavalli(100);
        System.out.println("L'auto ha " + porsche.getNumeroCavalli() + " cavalli");


        Automobile punto = new Automobile("Fiat");
        punto.setNumeroPorte(5);
        punto.setMarca("Fiat");
        punto.setModello("Punto");
        punto.setTarga("IT001OO");
        System.out.println("La punto ha " + punto.getNumeroPorte() + " porte");

        System.out.println("La tua punto: " + punto);
        Automobile punto2 = new Automobile("IT002OO", "Fiat");
        
        Automobile [] magazzinoAuto = {porsche, punto, punto2}; 
        System.out.println("Porsche: " + porsche);
        porsche = null;
        System.out.println("Porsche: " + porsche);
        porsche = new Automobile("Porsche");
        System.out.println("Porsche: " + porsche);
        
        Automobile dacia = new Automobile("GN...", "Dacia");
        System.out.println(dacia.getMarca());
    }
}
