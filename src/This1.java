public class This1
{
    /**
     Using "this" to Refer to Current Class Instance Variables - age and name inside constructor
     */
    private int age;
    private String name;

    This1(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }

    public static void main(String[] args)
    {
        This1 obj = new This1("Ashish", 28);
        This1 obj2 = new This1("Pratik", 27);
        obj.printDetails();
        obj2.printDetails();
        obj.setName("Akshay");
        System.out.println("Name has been changed to " + obj.getName());

    }
}
