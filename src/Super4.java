public class Super4
{
    /**
     Use of super with Methods
     In the above example, we have called the superclass constructor using the keyword "super" via subclass constructor.
     */
    Super4(){
        System.out.println("Inside parent class constructor");
    }
}

class Super5 extends Super4{
    Super5(){
        super();
        System.out.println("Inside child class constructor");
    }

    public static void main(String[] args)
    {
        Super5 obj = new Super5();
    }
}
