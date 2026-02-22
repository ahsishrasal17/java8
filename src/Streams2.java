import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,4546,7568,9789,423,4567,875876,89696,5345,2342342,9,0,234,0,2);
        List<Integer> filteredList = list.stream().
                filter(x -> x % 2 == 0).
                map(x -> x/2).
                distinct().
                sorted((o1,o2) -> o2 - o1).
                limit(4).
                skip(2).
                collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
