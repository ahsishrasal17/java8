import java.sql.SQLOutput;

public class Super{
    /**
     Use of super with Variables
     This scenario occurs when a derived class and base class have the same data members.
     Suppose there is a child, whose name is "Max" and the child has also a parent named "Max". Normally,to refer to the parent,
     we would say "parent Max", this is similar to using super.maxSpeed.
     In the above example, both the base class and subclass have a member maxSpeed. We could access the maxSpeed of the base class
     in subclass using super keyword.
     */
    int maxSpeed = 120;
}

class Super1 extends Super{
    int maxSpeed = 180;
    void display(){
        System.out.println("Maximum Speed of Derived Class is : " + maxSpeed);
        System.out.println("Maximum Speed of Base Class is : " + super.maxSpeed);
    }

    public static void main(String[] args)
    {
        Super1 obj = new Super1();
        obj.display();
    }
}
