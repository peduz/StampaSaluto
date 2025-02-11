package calcolatore;

public final class CalcolatriceScientifica extends Calcolatrice {

    @Override
    public int somma(int a, int b) {
        System.out.println("La somma dei valori è " + (a+b));
        return a+b;
    }

    // non si può fare override di un metodo final
    // @Override
    // public int somma(int a, int b, int c) {
    //     System.out.println("La somma dei valori è " + (a+b));
    //     return a+b;
    // }

}
