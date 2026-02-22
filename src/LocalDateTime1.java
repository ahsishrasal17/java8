import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalDateTime1 {
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime parsedLocalDateTime = LocalDateTime.parse("2026-02-22T17:30:00.000");
        System.out.println(parsedLocalDateTime);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
