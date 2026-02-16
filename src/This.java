public class This
{
    /**
     Using "this" to Refer to Current Class Instance Variables - age and name inside get and set methods
    */

    private int age;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args)
    {
        This obj = new This();
        obj.setAge(27);
        obj.setName("Ashish");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}
