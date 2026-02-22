import java.time.LocalDate;
import java.time.Month;

import static java.time.LocalTime.now;

public class LocalDate1 {
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate customDate = LocalDate.of(1997, 8, 1);
        System.out.println(customDate);

        int dayOfMonth = today.getDayOfMonth();
        System.out.println(dayOfMonth);

        Month month = today.getMonth();
        System.out.println(month);

        int year = today.getYear();
        System.out.println(year);

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        if(today.isAfter(yesterday)){
            System.out.println(today);
        }
    }
}
