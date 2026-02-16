public class ConstructorDefault
{
    /**
     Default Constructor
     A default constructor has no parameters. It’s used to assign default values to an object. If no constructor is
     explicitly defined, Java provides a default constructor.
     It is not necessary to write a constructor for a class because the Java compiler automatically creates a default constructor
     (a constructor with no arguments) if your class doesn’t have any.
     */
    ConstructorDefault(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args)
    {
        ConstructorDefault obj = new ConstructorDefault();
    }
}
