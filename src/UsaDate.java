
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsaDate {

    public static void main(String[] args) {
        LocalTime time;

        LocalDate date;

        LocalDateTime dateTime;

        time = LocalTime.now();

        date = LocalDate.now();

        dateTime = LocalDateTime.now();

        LocalDate miaNascita = LocalDate.of(1991, 8, 07);
        System.out.println(miaNascita);
        miaNascita = LocalDate.of(1991, Month.AUGUST, 07);
        System.out.println(miaNascita);

        LocalTime orario = LocalTime.of(10, 45, 32);
        System.out.println(orario);

        LocalDateTime oraData = LocalDateTime.of(miaNascita, orario);

        System.out.println(oraData);
        oraData = LocalDateTime.of(2023, 10, 25, 12, 21, 12);
        
        System.out.println(oraData.getDayOfWeek());
        System.out.println(oraData.getDayOfYear());
        System.out.println(oraData);


        if(dateTime.isAfter(oraData)) {
            System.out.println("è successivo");
        } else {
            System.out.println("è precedente");
        }

        if(dateTime.isBefore(oraData)) {
            System.out.println("è precedente");
        } else {
            System.out.println("è successivo");
        }

    }
}
