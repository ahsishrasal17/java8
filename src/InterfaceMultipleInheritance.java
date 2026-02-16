interface AB{
    default void sayHello(){
        System.out.println("Hello of AB");
    }
}

interface AC{
    default void sayHello(){
        System.out.println("Hello of AC");
    }
}


public class InterfaceMultipleInheritance implements AB, AC {
    public static void main(String[] args)
    {
        InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance();
        obj.sayHello();
    }

    public void sayHello(){
        AB.super.sayHello();
    }
}
