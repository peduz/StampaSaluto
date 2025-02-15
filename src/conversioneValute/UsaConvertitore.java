package conversioneValute;

import java.util.Scanner;

public class UsaConvertitore {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la valuta di cambio (USD, GBP, JPY)");
        String valuta = scan.nextLine();

        System.out.println("Inserisci l'importo da valutare ");
        double importo = scan.nextDouble();

        double conversione = ConvertitoreValute.converti("EUR", valuta, importo);

        System.out.println("Il valore convertito è " + conversione);

    }
}
