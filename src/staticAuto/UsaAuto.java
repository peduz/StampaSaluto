package staticAuto;

public class UsaAuto {
    
    public static void main(String[] args) {
        /*
         * Scrivi un programma che:
            Crei alcune auto e stampi il loro numero di telaio e modello.
            Stampi il numero totale di auto create.
         */

         Auto auto1 = new Auto("Porsche");
         auto1.nome = "pippo";

         Auto auto2 = new Auto("Fiat panda");

         Auto auto3 = new Auto("Aston Martin");

         Auto auto4 = new Auto("Bugatti");

         System.out.println("Il numero di telaio di " + auto1.getModello() 
                            + " è: " + auto1.getNumeroTelaio());
                            
         System.out.println("Il numero di telaio di " + auto2.getModello() 
                            + " è: " + auto2.getNumeroTelaio());
         
         System.out.println("Il numero di telaio di " + auto3.getModello() 
                            + " è: " + auto3.getNumeroTelaio());
                            
         System.out.println("Il numero di telaio di " + auto4.getModello() 
                            + " è: " + auto4.getNumeroTelaio());

        System.out.println("Il numero totale di auto create è " + Auto.getNumeroTotaleAuto()); 
    }

}
