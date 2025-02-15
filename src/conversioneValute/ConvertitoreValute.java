package conversioneValute;

public class ConvertitoreValute {
    /*
     * Sistema di Conversione Valute
        Crea una classe ConvertitoreValute che contenga un array 
        di tassi di cambio (es. da EUR a USD, GBP, JPY...) 
        dichiarato come final static per impedire modifiche.

        Implementa un metodo 
        static double converti(String da, String a, double importo), 
        che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, 
        restituendo il valore convertito.
     */

     public static final double [] TASSI_CAMBIO = 
     {
         1.09, //USD
         0.87, //GBP
         130.52 //JPY
     };

     public static final TassoDiCambio [] TASSI_DI_CAMBIO = 
                                        {
                                            new TassoDiCambio("EUR", "USD", 1.09),
                                            new TassoDiCambio("EUR", "GBP", 0.87),
                                            new TassoDiCambio("EUR", "JPY", 130.52),
                                        };

                        
    

    static double converti(String da, String a, double importo) {
        if(da.equals("EUR")) {
            if(a.equals("USD")) {
                return importo * TASSI_CAMBIO[0];
            } else if(a.equals("GBP")) {
                return importo * TASSI_CAMBIO[1];
            } else if(a.equals("JPY")) {
                return importo * TASSI_CAMBIO[2];
            } else {
                System.out.println("Valuta di arrivo non consentita");
                return 0;
            }
        } else {
            System.out.println("Valuta di partenza non consentita");
            return 0;
        }
    }

}
