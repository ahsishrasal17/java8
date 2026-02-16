public class Super2
{
    /**
     Use of super with Methods
     This is used when we want to call the parent class method. So, whenever a parent and child class have the same-named
     methods then to resolve ambiguity we use the super keyword.
     In the above example, we have seen that if we only call method message() then, the current class message() is invoked
     but with the use of the super keyword, message() of the superclass could also be invoked.
     */
    void message(){
        System.out.println("This is the base/parent class");
    }
}

class Super3 extends Super2{
    void message(){
        System.out.println("This is the derived/child class");
    }

    void display(){
        message();
        super.message();
    }

    public static void main(String[] args)
    {
        Super3 obj = new Super3();
        obj.display();
    }
}
