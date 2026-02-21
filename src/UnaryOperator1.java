import java.util.function.UnaryOperator;

public class UnaryOperator1 {
    public static void main(String[] args)
    {
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> unaryOperator1 = str -> str.toUpperCase();
        System.out.println(unaryOperator1.apply("ashish"));
    }
}
