public class ConstructorCopy
{
    /**
     Unlike other constructors copy constructor is passed with another object which copies the data available from the passed
     object to the newly created object.
     Java does not provide a built-in copy constructor like C++. We can create our own by writing a constructor that takes an
     object of the same class as a parameter and copies its fields.
     */
    String name;
    int id;

    ConstructorCopy(String name, int id){
        this.name = name;
        this.id = id;
    }

    ConstructorCopy(ConstructorCopy obj1){
        this.name = obj1.name;
        this.id = obj1.id;
    }

    public static void main(String[] args)
    {
        System.out.println("First Object");
        ConstructorCopy obj = new ConstructorCopy("Ashish", 17);
        System.out.println("Name = " + obj.name + " : " + "id = " + obj.id);

        System.out.println("Second on=bject used as copy constructor");
        ConstructorCopy obj2 = new ConstructorCopy(obj);
        System.out.println("Name = " + obj2.name + " : " + "id = " + obj2.id);
    }
}
