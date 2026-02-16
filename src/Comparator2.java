import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2)
    {
        return o2.length() - o1.length();
    }
}

public class Comparator2
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple", "banana", "date");
        words.sort(new MyComparator2());
        System.out.println(words);
    }
}
