package poligoni;

public class UsaPoligoni {
    /*
     *  Creare un’interfaccia Poligono con due metodi: calcolaPerimetro() e calcolaArea().
        Creare almeno due classi concrete che rappresentano dei poligoni e che implementano l’interfaccia.
        Ogni classe può avere un insieme di propri attributi e anche altri metodi
        oltre a quelli dell’interfaccia.
        Creare una classe Main di test in cui generare delle istanze dei poligoni.
     */
    public static void main(String[] args) {
        Poligono p = new Rettangolo(5, 10);
        // System.out.println(p.toString());

        Poligono q = new Quadrato(15);
        System.out.println(q);

        Triangolo triEqui = new TriangoloEquilatero(12, 3);

        System.out.println(triEqui);
    }
    

    private static int opTernario(int a) {
        // if(a > 0) {
        //     return a;
        // } else {
        //     return a*-1;
        // }

        return  a >= 0 ? a : (a*-1);
    }
}
