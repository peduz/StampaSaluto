package exArray;

public class UsaInsieme {
    
    public static void main(String[] args) {
        Insieme i = new Insieme(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Insieme i2 = new Insieme(24, 2, 5, 67, 12, 87, 3);

        Insieme intersezione = i.intersezione(i2);
        Insieme intersezione2 = i2.intersezione(i);
        intersezione.stampaInsieme();
        intersezione2.stampaInsieme();
    }
}
