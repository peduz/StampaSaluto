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
        

        Ciclabile ciclo2 = new Ciclabile();
        ciclo2.addElemento(1);
        System.out.println(ciclo2.getElementoSuccessivo());
        ciclo2.addElemento(2);
        System.out.println(ciclo2.getElementoSuccessivo());
        ciclo2.addElemento(3);
        System.out.println(ciclo2.getElementoSuccessivo());
        ciclo2.addElemento(4);
        System.out.println(ciclo2.getElementoSuccessivo());
    }
}
