package calcolatore;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsaCalcolatrice {
  
 

    public static void main(String[] args) {
        // int somma = Calcolatrice.somma(2, 4);
        // System.out.println(somma);

        double divisione = Calcolatrice.divisione(23.24, 12.451);

        System.out.println(divisione);

        BigDecimal a = new BigDecimal(23.24);
        BigDecimal b = new BigDecimal(12.451);
        a = a.setScale(40, RoundingMode.HALF_UP);
        b = b.setScale(40, RoundingMode.HALF_UP);

        
        BigDecimal divisione2 = Calcolatrice.divisioneBigDecimal(a, b);

        BigDecimal somma = a.add(b);
        BigDecimal differenza = a.subtract(b);
        BigDecimal prodotto = a.multiply(b);
        System.out.println(divisione2.toPlainString());
        
    }

}
