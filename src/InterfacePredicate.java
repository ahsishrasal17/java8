@FunctionalInterface
interface Predicate<T>{
    boolean test(T t);
}

public class InterfacePredicate
{
    public static void main(String[] args)
    {
        Predicate<Integer> isEven = (Integer val) -> {
            if(val%2 == 0){
                return true;
            }
            else
                return false;
        };
        System.out.println(isEven.test(10));
    }
}
