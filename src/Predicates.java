import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates
{
    public static void main(String[] args)
    {
        Predicate<Integer> predicate = x -> x > 100000;
        System.out.println(predicate.test(1000000));
        int salary = 90000;
        if(predicate.test(salary)){
            System.out.println("Salary Greater than 1 Lakh");
        }else{
            System.out.println("Salary less than 1 Lakh");
        }

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

        Predicate<Integer> isEven = x -> x%2 == 0;
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        for(Integer number : list1){
            if(isEven.test(number)){
                System.out.println(number);
            }
        }

        Predicate<String> string = y -> y.toLowerCase().charAt(0) == 'a';
        System.out.println(string.test("Ashish"));

    }
}
