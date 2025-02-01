public class ClasseEsercizio5 {
    
    public int contatore = 0;

    public void a() {
        if(contatore == 10) {
            return;
        } else {
            contatore = contatore + 1;
            System.out.println(contatore);
            b();
        }
    }

    public void b() {
        c();
    }

    public void c() {
        a();
    }
}
