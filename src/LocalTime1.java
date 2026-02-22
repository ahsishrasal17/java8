import java.time.LocalTime;

public class LocalTime1 {
    public static void main(String[] args)
    {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        int hour = now.getHour();
        System.out.println(hour);

        int minute = now.getMinute();
        System.out.println(minute);

        int second = now.getSecond();
        System.out.println(second);

        LocalTime customeTime = LocalTime.of(12, 01, 02);
        System.out.println(customeTime);

        String timeInString = "15:30:45";
        LocalTime parsedTime = LocalTime.parse(timeInString);
        System.out.println(parsedTime);

        LocalTime beforeOneHour = now.minusHours(1);
        System.out.println(beforeOneHour);
    }
}
