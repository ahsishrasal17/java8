import java.util.function.BiConsumer;

public class BiConsumer1 {
    public static void main(String[] args)
    {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(2,4);
    }
}
