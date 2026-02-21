import java.util.Set;
import java.util.TreeSet;

public class Comparator6 {
    public static void main(String[] args)
    {
        Set<Integer> s = new TreeSet<>();
        s.add(41);
        s.add(22);
        s.add(60);
        s.add(39);
        System.out.println("Set Before Sorting " + s);
        Set<Integer> ss = new TreeSet<>((a,b) -> b - a);
        ss.add(41);
        ss.add(22);
        ss.add(60);
        ss.add(39);
        System.out.println("Set After using Comparator " + ss);
    }
}
