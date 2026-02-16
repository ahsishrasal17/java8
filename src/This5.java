public class This5
{
    /**
     Using "this" Keyword to Invoke the Current Class Method
     Line no 8 invokes the show method of current class
     */
    void dispaly(){
        this.show();
        System.out.println("Inside display function");
    }

    void show(){
        System.out.println("Inside show function");
    }

    public static void main(String[] args)
    {
        This5 obj = new This5();
        obj.dispaly();
    }
}
