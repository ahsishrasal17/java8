import java.util.function.BiPredicate;

public class BiPredicate1 {
    public static void main(String[] args)
    {
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(2,4));

        BiPredicate<String, Integer> biPredicate1 = (str, x) -> str.length() == x;
        System.out.println(biPredicate1.test("Ashish",6));
    }
}
