package calcolatore;

public class Calcolatrice {

    public static final double PI = 3.14;

    public static final double E = 0.5772156;

    public int somma(int a, int b) {
        return a + b;
    }

    public final int somma(int a, int b, int c) {
        return a + b + c;
    }
    public static final long prodotto(int a, int b) {
        return a*b;
    }

    public static final int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int differenza(int a, int b) {
        return a - b;
    }

    public static double divisione(int a, int b) {
        return (double) a/b;
    }

    public static double potenza(int base, int esponente) {
        return Math.pow(base, esponente);
    }
}
 