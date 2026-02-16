
interface Supplier<T>{
    T get();
}

public class InterfaceSupplier
{
    public static void main(String[] args)
    {
        Supplier<String> supplier = () -> "Supplier Interface";
        System.out.println(supplier.get());
    }
}
