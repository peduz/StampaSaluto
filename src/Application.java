public class Application {
    
    static float conVirgola = 2.4F;
    
    public static void main(String[] args) {
        int numero;
        // Io o comprato
        String parola = null;
        int somma = 2 + 3;

        int resto = somma % 2;
        System.out.println("Il resto della divisione è " + resto);
        
        System.out.println("Somma è maggiore di resto? " + (somma > resto));

        parola = "pippo";


        short corto = 32767;
        // corto = 32768;

        int minimo = Integer.MIN_VALUE;

        System.out.println(minimo);

        double minDouble = Double.MAX_VALUE;

        double d = 32.4;
        System.out.println(minDouble);
        
        System.out.println(parola);
        System.out.println(conVirgola);
        System.out.println("Ciao la somma è " + somma);
        

        char a = 'a';
        String b = "b";
        String ciao = "cia";
        ciao = ciao + "o";
        System.out.println(ciao.toUpperCase());

        System.out.println(ciao);

        ciao = ciao.toUpperCase();

 
        System.out.println(ciao);

        /*
         *=================
         *  0   1   2   3
         *  C   I   A   O
         * ================
         */
        char c = ciao.charAt(0);
        System.out.println(c);

        byte [] bytesFromString = ciao.getBytes();
        
        String fromArray = new String(bytesFromString);
        System.out.println(fromArray);

        fromArray = fromArray + " ";
        
        /*
         *=================
         *  0   1   2   3   4
         *  C   I   A   O   
         * ================
         */
        char spazio = fromArray.charAt(4);
        System.out.println(spazio);


        String numOtto = "8";
        String piuUno = numOtto + 1;
        System.out.println(piuUno);

        System.out.println("La somma tra 2 e 3 fa = " + (2 + 3));

        int espressione =  2147483647 + 1;
        System.out.println(espressione);

    }

}