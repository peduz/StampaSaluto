package calcolatore;

public class UsaCalcolatrice {
  
    public void stampaSaluto(String nome) {
        System.out.println("Ciao " + nome);
    }

    public static void main(String[] args) {
        // int somma = Calcolatrice.somma(2, 4);
        // System.out.println(somma);

        saluta();

        UsaCalcolatrice uc = new UsaCalcolatrice();
        uc.stampaSaluto("Giuseppe");

        Calcolatrice c = new Calcolatrice();
        int somma = c.somma(2, 4);

        long prodotto = Calcolatrice.prodotto(10, 234324);
        System.out.println(prodotto);
    }

    public static void saluta() {
        System.out.println("Ciao");
    }   
}
