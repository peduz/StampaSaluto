package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsaMappa {

    public static void main(String[] args) {
        
        Map<String, String> mapString = new HashMap<>();//LinkedHashMap
        
        mapString.put("key", "value");
        mapString.put("key2", "value2");
        mapString.put("key3", "value3");

        System.out.println(mapString);

        System.out.println(mapString.get("key"));

        // for(String chiave : mapString.keySet()) {
        //     System.out.println("La chiave è: " + chiave
        //             + " e il valore è " + mapString.get(chiave));
        // }

        for(String val : mapString.values()) {
            System.out.println("Il valore è: " + val);
        }
        List<String> lista = new ArrayList<>();
        lista.add("pippo");
        lista.add("pluto");
        lista.add("paperino");


        Map<String, List<String>> mapList = new HashMap<>();

        mapList.put("lista1", new ArrayList<>());
        mapList.get("lista1").add("Valore1");
        mapList.get("lista1").addAll(lista);

        System.out.println(mapList);

        // for(int i = 0; i < mapList.size(); i++) {
            // System.out.println(mapList.get(i)); //NON FUNZIONA
        // }

        // for(int i = 0; i < mapList.keySet().size(); i++) {
        // ...
        // }

        for(String chiave : mapList.keySet()) {
            System.out.println("La chiave è: " + chiave
                    + " e il valore è " + mapList.get(chiave));
        }
    }
}
