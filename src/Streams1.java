import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Ashish","Pratik","Akshay");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        String array[] = {"Ashish","Pratik","Akshay"};
        Stream<String> stream1 = Arrays.stream(array);
        System.out.println(stream1);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Stream.iterate(0, n -> n + 1).limit(100);

        Stream<String> limit = Stream.generate(() -> "hello").limit(5);
    }
}
