import com.sun.security.jgss.GSSUtil;

import java.util.Objects;
import java.util.function.Predicate;

public class Predicates1 {
    public static void main(String[] args)
    {
        Predicate<String> string1 = x -> x.toLowerCase().charAt(0) == 'a';
        Predicate<String> string2 = x -> x.toLowerCase().charAt(x.length() - 1) == 'h';
        Predicate<String> and = string1.and(string2);
        System.out.println(and.test("Ashish"));
        System.out.println(string1.negate().test("Ashish"));
        Predicate<Object> predicate = Predicate.isEqual("Ashish");
        System.out.println(predicate.test("Ashish"));
    }
}
