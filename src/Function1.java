public class Function1 {
    public static void main(String[] args)
    {
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Ashish"));
        Function<String, String> function1 = x -> x.substring(0,3);
        System.out.println(function1.apply("Ashish"));
    }
}
