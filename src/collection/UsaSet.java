package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UsaSet {
    
    public static void main(String[] args) {
        Set<String> setStringhe = new HashSet<>();//LinkedHashSet

        setStringhe.add("Pippo");
        setStringhe.add("Pluto");
        setStringhe.add("paperino");
        setStringhe.add("Pippo");

        System.out.println(setStringhe.size());
        System.out.println(setStringhe);

        System.out.println(setStringhe.contains("Pippo"));

        
        Set<String> setStringheOrd = new LinkedHashSet<>();

        setStringheOrd.add("Pippo");
        setStringheOrd.add("Pluto");
        setStringheOrd.add("paperino");
        setStringheOrd.add("pippo");
        System.out.println(setStringheOrd);
    }
}
