
import java.util.Scanner;

public class Conditionals {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Inserisci la tua età: ");
        // int age = scan.nextInt();
        
        // if(age >= 18) {
        //     System.out.println("Sei maggiorenne");
        // } else if(age < 20000000) {
        //     System.out.println("Non sei un dinosauro");
        // } else {
        //     System.out.println("Sei minorenne");
        // }

        // switch (age) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     case 6:
        //     case 7:
        //     case 8:
        //     case 9:
        //     case 10:
        //     case 11:
        //     case 12:
        //     case 13:
        //     case 14:
        //     case 15:
        //     case 16:
        //     case 17:
        //         System.out.println("Sei minorenne");
        //         break;
        //     default:
        //         System.out.println("Sei maggiorenne");
        // }

        System.out.println("Inserisci il tipo di abito");
        String abito = scan.nextLine();

        switch (abito) {
            case "cappotto":
                System.out.println("Indumento invernale");
                break;
            case "canottiera":
            case "pantaloncini":
                System.out.println("Indumento estivo");
        }

        if(abito.equals("cappotto")) {
            System.out.println("Indumento invernale");
        } else if(abito.equals("canottiera") || abito.equals("pantaloncini")) {
            System.out.println("Indumento estivo");
        }
    }
}
