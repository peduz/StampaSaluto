import java.util.Scanner;

public class CheckGuest {
    
    public static void main(String[] args) {
        String [] invitati = 
            {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
            "Ilary Blasi", "Bebe Vio", "Luis", 
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
     
        Scanner scan = new Scanner(System.in);
        System.out.println("Come ti chiami? ");
        String nome = scan.nextLine();

        boolean trovato = false;
        int i = 0;
        while(i < invitati.length) {
            
            if(nome.equals(invitati[i])) {
                System.out.println("Sei invitato, entra");
                trovato = true;
            }

            i++;
        }
        if(!trovato) {
            System.out.println("Non sei stato invitato");
        }
    }
}
