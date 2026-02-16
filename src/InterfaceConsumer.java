@FunctionalInterface
interface Consumer<T>{
    void accept(T t);
}

public class InterfaceConsumer
{
    public static void main(String[] args)
    {
        Consumer<Integer> loggingObject = (Integer val) ->
        {
            if (val > 10)
                System.out.println("Logging");
            else
            System.out.println("Denied");

        };

        loggingObject.accept(9);
    }

    }

