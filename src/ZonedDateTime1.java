import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime1
{
    public static void main(String[] args)
    {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        //availableZoneIds.forEach(System.out::println);

        ZonedDateTime custom = ZonedDateTime.of(1997, 8, 01, 14, 50, 00, 98, ZoneId.of("Europe/Guernsey"));
        System.out.println(custom);

    }
}
