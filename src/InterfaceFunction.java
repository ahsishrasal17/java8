
@FunctionalInterface
interface Function<T, R>{
    R apply(T t);
}



public class InterfaceFunction
{
    public static void main(String[] args)
    {
        Function<Integer, String> integerToString = (Integer num) ->
        {
            String output = num.toString();
            return output;
        };
        System.out.println(integerToString.apply(17));
    }
}
