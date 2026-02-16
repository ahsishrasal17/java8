

public class LambdaExpression implements Runnable{
    public static void main(String[] args)
    {
        Runnable runnable = () -> {
            for(int i=1; i<=10; i++){
                System.out.println("Hello "+ i);
            }
        };
        Thread childthread = new Thread(runnable);
        childthread.run();
    }

    @Override
    public void run()
    {

    }
}
