package collection;

import java.util.ArrayList;
import java.util.List;

public class UsaList {
 
    public static void main(String[] args) {
        List<String> listaStringhe = new ArrayList<>();
        
        listaStringhe.add("Pippo");
        listaStringhe.add("pluto");

        System.out.println(listaStringhe);

        System.out.println(listaStringhe.get(0));
        System.out.println(listaStringhe.indexOf("pluto"));

        String elem = listaStringhe.remove(1);
        System.out.println(elem);

        boolean eliminato = listaStringhe.remove("Pippo");
        System.out.println(listaStringhe);

        listaStringhe.add("Giuseppe");
        listaStringhe.add("Mario");
        listaStringhe.add("Antonio");

        if(listaStringhe.contains("Giuseppe")) {
            System.out.println("è presente");
        }

        System.out.println(listaStringhe);
        listaStringhe.set(2, "Luigi");
        System.out.println(listaStringhe);
        listaStringhe.add(0, "Pippo");
        System.out.println(listaStringhe);

        for(int i = 0; i < listaStringhe.size(); i++) {
            System.out.println("Posizione " + i
                        + ", elemento " + listaStringhe.get(i));
        }
    }
}
