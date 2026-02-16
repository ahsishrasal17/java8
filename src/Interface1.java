// A simple example of how intwrface works
interface A{
    final int a = 10;
    void display();
}

class B implements A{
    public void display(){
        System.out.println("In display");
    }
}

public class Interface1
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.display();
        System.out.println(obj.a);
    }

}
