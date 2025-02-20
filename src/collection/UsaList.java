package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import poligoni.Rettangolo;

public class UsaList {
 
    public static void main(String[] args) {
        // List<String> listaStringhe = new ArrayList<>();
        
        // listaStringhe.add("Pippo");
        // listaStringhe.add("pluto");

        // System.out.println(listaStringhe);

        // System.out.println(listaStringhe.get(0));
        // System.out.println(listaStringhe.indexOf("pluto"));

        // String elem = listaStringhe.remove(1);
        // System.out.println(elem);

        // boolean eliminato = listaStringhe.remove("Pippo");
        // System.out.println(listaStringhe);

        // listaStringhe.add("Giuseppe");
        // listaStringhe.add("Mario");
        // listaStringhe.add("Antonio");

        // if(listaStringhe.contains("Giuseppe")) {
        //     System.out.println("è presente");
        // }

        // System.out.println(listaStringhe);
        // listaStringhe.set(2, "Luigi");
        // System.out.println(listaStringhe);
        // listaStringhe.add(0, "Pippo");
        // System.out.println(listaStringhe);

        // for(int i = 0; i < listaStringhe.size(); i++) {
        //     System.out.println("Posizione " + i
        //                 + ", elemento " + listaStringhe.get(i));
        // }

        // System.out.println("Lista prima dell'ordinamento: " + listaStringhe);

        // Collections.sort(listaStringhe);
        // System.out.println("Lista dopo l'ordinamento: " + listaStringhe);

        // List<Double> listaDouble = new ArrayList<>();

        // listaDouble.add(1.23);
        // listaDouble.add(-1.3);
        // listaDouble.add(12D);
        // listaDouble.add(23.2);
        // listaDouble.add(-1232D);
        // listaDouble.add(2343.34);
        // listaDouble.add(-23435.2);
        // System.out.println(listaDouble);

        // Collections.sort(listaDouble);
        // System.out.println(listaDouble);

        Rettangolo rett = new Rettangolo(10, 2);
        Rettangolo rett2 = new Rettangolo(1, 22);
        Rettangolo rett3 = new Rettangolo(10, 12);
        Rettangolo rett4 = new Rettangolo(3, 21);

        List<Rettangolo> rettangoli = new ArrayList<>();
        rettangoli.add(rett);
        rettangoli.add(rett2);
        rettangoli.add(rett3);
        rettangoli.add(rett4);

        System.out.println(rettangoli);

        Collections.sort(rettangoli);
        System.out.println(rettangoli);
    }
}
