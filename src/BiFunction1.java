import java.util.function.BiFunction;

public class BiFunction1 {
    public static void main(String[] args)
    {
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length() + str2.length();
        System.out.println(biFunction.apply("Ashish","Rasal"));
    }
}
