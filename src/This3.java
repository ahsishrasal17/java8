public class This3
{
    /**
     Using "this" Keyword to Return the Current Class Instance
     Line no 16 returns the current class instance
     Called using - obj.get().display();
     */
    int a;
    int b;

    This3(){
        a = 10;
        b = 20;
    }

    This3 get(){
        return this;
    }

    void display(){
        System.out.println("a= " + a + " : " + "b= " + b);
    }

    public static void main(String[] args)
    {
        This3 obj = new This3();
        obj.get().display();
    }
}
