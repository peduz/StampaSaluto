public class Esercizio5 {
    
    /*
     * scrivere una classe con 3 metodi: a, b, e c, 
     * il metodo a chiama il metodo b, 
     * il metodo b chiama il metodo c , 
     * e il metodo c chiama il metodo a; 
     * 
     * questo ciclo altrimenti infinito deve interrompersi dopo 10 giri, 
     * le firme dei metodi sono a vostra discrezione, cosi come lo stato della classe, 
     * importante e' che i 3 metodi vengano chiamati in successione come richiesto
     */
    public static void main(String[] args) {
        ClasseEsercizio5 ex = new ClasseEsercizio5();
        ex.a();
    }
}
