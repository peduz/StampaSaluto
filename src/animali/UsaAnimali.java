package animali;

public class UsaAnimali {
    
    public static void main(String[] args) {
        Cane fuffi = new Cane();
        fuffi.setCarnivoro(false);
        fuffi.setNome("Fuffi");
        fuffi.setCoda(true);
        fuffi.setRazza("Maltese");
        fuffi.setConChip(true);
        fuffi.setPedigree(true);

        Cane pippo = new Cane();
        pippo.setCarnivoro(false);
        pippo.setNome("Fuffi");
        pippo.setCoda(true);
        pippo.setRazza("Maltese");
        pippo.setConChip(true);
        pippo.setPedigree(true);

        if(pippo.equals(fuffi)) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Sono diversi");
        }

        Gatto ares = new Gatto();
        ares.setInfame(true);
        ares.setCoda(true);
        ares.setRazza("Sphinx");
        ares.setColorePelo("senza pelo");
        ares.setNome("Ares");


        Tigre diego = new Tigre();
        diego.setNome("Diego");
        diego.setCoda(true);
        diego.setCarnivoro(true);
        diego.setPredatore(true);
        diego.setLunghezzaArtigli(100);
        diego.setProvenienza("Preistoria");

        Mammifero [] mammiferi = {fuffi, pippo, diego, ares};
    }
}
