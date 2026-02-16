public class This6{
    /**
     Using "this" Keyword as an Argument in the Constructor Call
     Line no 18 is used to call another constructor
     */
    This7 obj;

    This6(This7 obj){
        this.obj = obj;
        obj.display();
    }
}

class This7{
    int x = 17;

    This7(){
        This6 obj = new This6(this);
    }

    void display(){
        System.out.println("Value of x is " + x);
    }

    public static void main(String[] args)
    {
        This7 obj = new This7();
    }

}
