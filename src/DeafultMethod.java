interface BA{
    default void sayHello(){
        System.out.println("Hello");
    }
}

interface BB{
    default void sayHello(){
        System.out.println("Hello");
    }
}

public class DeafultMethod implements BA, BB
{
    public static void main(String[] args)
    {
        DeafultMethod obj = new DeafultMethod();
        obj.sayHello();
    }

    @Override
    public void sayHello()
    {
        BB.super.sayHello();
    }
}
