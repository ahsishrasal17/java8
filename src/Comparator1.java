import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer s1, Integer s2)
    {
        return s2-s1;
    }
}

public class Comparator1
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);
    }
}
