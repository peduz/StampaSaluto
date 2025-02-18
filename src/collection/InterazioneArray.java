package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterazioneArray {
    
    public static void main(String[] args) {
        String [] arr = {"pippo", "pluto", "paperino"};
        List<String> fromArray = Arrays.asList(arr);

        String[] array2 = new String[fromArray.size()];
        fromArray.toArray(array2);

        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        List<Integer> listInt = new ArrayList<>();
        /*
         * -> BOXING 
         * <- UNBOXING
         * int <-> Integer
         * boolean <-> Boolean
         * float <-> Float
         * double <-> Double
         * short <-> Short
         * char <-> Character
         * long <-> Long
         */
        int cinque = 5;
        Integer c = cinque;//BOXING

        Long dieci = 10L;
        long d = dieci;//UNBOXING
    }
}
