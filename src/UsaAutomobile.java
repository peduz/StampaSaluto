public class UsaAutomobile {
    

    public static void main(String[] args) {
        Automobile porsche = new Automobile("Porsche");
        porsche.numeroPorte = 5;
        porsche.modello = "GT3";
        porsche.targa = "IT000OO";
        porsche.numeroCavalli = 300;
        System.out.println("Il numero di porte è: " + porsche.numeroPorte);

        System.out.println("La marca è " + porsche.marca);
        System.out.println("L'auto ha " + porsche.numeroCavalli + " cavalli");
        porsche.addNumeroCavalli(100);
        System.out.println("L'auto ha " + porsche.numeroCavalli + " cavalli");


        Automobile punto = new Automobile("Fiat");
        punto.numeroPorte = 5;
        punto.marca = "Fiat";
        punto.modello = "Punto";
        punto.targa = "IT001OO";
        System.out.println("La punto ha " + punto.getNumeroPorte() + " porte");

        System.out.println("La tua punto: " + punto);
        Automobile punto2 = new Automobile("IT002OO", "Fiat");
        


        Automobile [] magazzinoAuto = {porsche, punto, punto2}; 
    }
}
