@FunctionalInterface
interface ABC{
    int Calculation(int x);
}
public class FunctionalInterface1 {
    public static void main(String[] args)
    {
        int a = 5;
        ABC func = x -> x * x;
        int result = func.Calculation(a);
        System.out.println(result);
    }
}
