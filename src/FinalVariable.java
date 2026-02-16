public class FinalVariable{
    static final double PI = 3.1456789;
    public static void main(String[] args)
    {
        System.out.println(PI);
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
    }
}
