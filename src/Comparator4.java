import java.util.Set;
import java.util.TreeSet;

public class Comparator4
{
    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<>();
        set.add(13);
        set.add(2);
        set.add(55);
        System.out.println("Before sorting" + set);
        Set<Integer> set1 = new TreeSet<>( (a,b) -> b - a );
        set1.add(13);
        set1.add(2);
        set1.add(55);
        System.out.println("After sorting" + set1);
    }
}
