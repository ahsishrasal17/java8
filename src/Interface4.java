//This code represents use of abstract, default and static method in interface
interface C{
    void add();
    default void show(){
        System.out.println("In Show");
    }
    static void show1(){
        System.out.println("In Show1");
    }
}

public class Interface4 implements C{

    public void add(){
        System.out.println("In add");
    }

    public static void main(String[] args)
    {
        C.show1();
        Interface4 obj = new Interface4();
        obj.show();
        obj.add();
    }
}
