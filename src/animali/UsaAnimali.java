package animali;

public class UsaAnimali {
    
    public static void main(String[] args) {
        Cane fuffi = new Cane(2, "Maltese");
        fuffi.setCarnivoro(false);
        fuffi.setNome("Fuffi");
        fuffi.setCoda(true);
        fuffi.setConChip(true);
        fuffi.setPedigree(true);

        Cane pippo = new Cane(2, "Maltese");
        pippo.setCarnivoro(false);
        pippo.setNome("Fuffi");
        pippo.setCoda(true);
        pippo.setConChip(true);
        pippo.setPedigree(true);

        if(pippo.equals(fuffi)) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Sono diversi");
        }

        Gatto ares = new Gatto(5);
        ares.setInfame(true);
        ares.setCoda(true);
        ares.setRazza("Sphinx");
        ares.setColorePelo("senza pelo");
        ares.setNome("Ares");
        ares.faiVerso();

        fuffi.faiVerso();

        Tigre diego = new Tigre(300);
        diego.setNome("Diego");
        diego.setCoda(true);
        diego.setCarnivoro(true);
        diego.setPredatore(true);
        diego.setLunghezzaArtigli(100);
        diego.setProvenienza("Preistoria");

        Mammifero [] mammiferi = {fuffi, pippo, diego, ares};

        System.out.println(fuffi);
        
        System.out.println(diego);
    }
}
