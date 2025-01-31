public class UsaRettangolo {

    public static void main(String[] args) {
        Rettangolo mioRettangolo = new Rettangolo(5, 10);
        
        System.out.println("L'area con base " + mioRettangolo.getBase()
         + " e altezza " + mioRettangolo.getAltezza() + 
         " è: " + mioRettangolo.calcolaArea());


         mioRettangolo.setBase(10);
         System.out.println("L'area con base " + mioRettangolo.getBase()
          + " e altezza " + mioRettangolo.getAltezza() + 
          " è: " + mioRettangolo.calcolaArea());
    }
}
