public class This2
{
    /**
     Using this() to Invoke Current Class Constructor
     Line no 11 invokes parameterized constructor
     */
    private int a;
    private int b;

    This2(){
        this(10,20);
        System.out.println("Inside default contructor");
    }

    This2(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside Parameterized contructor");
        System.out.println("a=" + a + " : " +  "b=" + b);
    }

    public static void main(String[] args)
    {
        This2 obj = new This2();
    }
}
