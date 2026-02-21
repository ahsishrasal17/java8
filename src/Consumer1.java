import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args)
    {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Ashish");

        Consumer<List<Integer>> list = li -> {
            for(Integer i : li){
                System.out.println(i + 100);
            }
        };
        list.accept(Arrays.asList(1,2,3,4,5));

        Consumer<List<Integer>> list2 = li -> {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        list2.andThen(list).accept(Arrays.asList(1,2,3,4,5));
    }
}
