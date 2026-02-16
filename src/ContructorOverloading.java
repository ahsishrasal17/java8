public class ContructorOverloading
{
    ContructorOverloading(String name){
        System.out.println("Constructor with one argument name: " + name);
    }

    ContructorOverloading(String name, int age){
        System.out.println("Contructor with 2 arguments name and age: " + name + " : " + age);
    }

    ContructorOverloading(long id){
        System.out.println("Contructor with one argument id: " + id);
    }

    public static void main(String[] args)
    {
        ContructorOverloading obj = new ContructorOverloading("Ashish");
        ContructorOverloading obj1 = new ContructorOverloading("Ashish", 27);
        ContructorOverloading obj2 = new ContructorOverloading(123456);
    }
}
