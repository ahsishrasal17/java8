import java.util.function.BinaryOperator;

public class BinaryOperator1 {
    public static void main(String[] args)
    {
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Ashish ", "Rasal"));
    }
}
