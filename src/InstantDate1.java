import java.time.Instant;

public class InstantDate1
{
    public static void main(String[] args)
    {
        long curr = System.currentTimeMillis();
        System.out.println(curr);

        Instant now = Instant.now();
        System.out.println(now);
        
    }
}
