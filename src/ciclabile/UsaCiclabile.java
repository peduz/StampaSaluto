package ciclabile;

public class UsaCiclabile {
    
    public static void main(String[] args) {

        int[] elenco = {1, 2, 3};
        Ciclabile ciclo1 = 
                new Ciclabile(/*new int[] {1, 2, 3, 4}*/ elenco);

        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        System.out.println(ciclo1.hasAncoraElementi());
        
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        ciclo1.getElementoSuccessivo();
        
    }
}
