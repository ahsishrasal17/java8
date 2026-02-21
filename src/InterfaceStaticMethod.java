interface BC{
    static void sayHello(){
        System.out.println("Hello");
    }
}
public class InterfaceStaticMethod implements BC
{
    public static void main(String[] args)
    {
        BC.sayHello();
    }
}
