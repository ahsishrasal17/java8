public class ConstructorParameterized
{
    /**
     Parameterized Constructor
     A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class
     with our own values, then use a parameterized constructor.
     */
    private String name;
    private int id;

    public ConstructorParameterized(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name = " + name + " : " + "id = " + id);
    }

    public static void main(String[] args)
    {
        ConstructorParameterized obj = new ConstructorParameterized("Ashish", 17);
        obj.display();
    }
}
