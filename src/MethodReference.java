import java.util.Arrays;
import java.util.List;

public class MethodReference
{
    public void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        MethodReference method = new MethodReference();
        List<String> list = Arrays.asList("Ashish", "Pratik", "Akshay");
        list.forEach(method::print);

    }
}
