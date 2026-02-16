public class ConstructorPrivate
{
    /**
     A private constructor cannot be accessed from outside the class. It is commonly used in:
     Singleton Pattern: To ensure only one instance of a class is created.
     Utility/Helper Classes: To prevent instantiation of a class containing only static methods.
     */
    private ConstructorPrivate()
    {
        System.out.println("Private Constructor called");
    }

    public static void displayMeassage(){
        System.out.println("Public method called");
    }
}

class Main1{
    public static void main(String[] args)
    {
        //ConstructorPrivate obj = new ConstructorPrivate();
        ConstructorPrivate.displayMeassage();
    }
}
