//This example demonstrates how a class can implement multiple interfaces (Add and Sub) to provide functionality for both addition and subtraction operations.
interface Add{
    int add(int a, int b);
}

interface Sub{
    int sub(int a, int b);
}

class Calculation implements Add, Sub{

    public int add (int a, int b){
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }
}


public class Interface3
{
    public static void main(String[] args)
    {
        Calculation calc = new Calculation();
        System.out.println("Addition: " + calc.add(2,3));
        System.out.println("Subtraction: " + calc.sub(9,5));
    }
}
