package lezioneStatic;

public class UsaPersona {
   
    public static void main(String[] args) {
        Persona p = new Persona();
        p.mondoDiProvenienza = "Terra";
        p.setCognome("Pluto");
        p.setNome("Pippo");

        Persona p2 = new Persona();
        p2.setCognome("Pluto 2");
        p2.setNome("Pippo 2");

        Persona p3 = new Persona();
        p3.setCognome("Pluto 3");
        p3.setNome("Pippo 3");

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);

        p.setCognome("Paperino");
        System.out.println(p);

        p2.mondoDiProvenienza = "Saturno";
        
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
