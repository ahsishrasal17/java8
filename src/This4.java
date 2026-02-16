public class This4
{
    /**
     Using "this" Keyword as a Method Parameter
     Line no 21 calls dsiplay method with this reference of the object
     */
    int a;
    int b;

    This4(){
        a = 10;
        b = 20;
    }

    void display(This4 obj){
        System.out.println("a= " + obj.a + " : " + "b= " + obj.b);
    }

    void get(){
        display(this);
    }

    public static void main(String[] args)
    {
        This4 obj = new This4();
        obj.get();
    }
}
