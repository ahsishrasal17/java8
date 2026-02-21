import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

class Student5{
    private int rollno;
    private String name;

    Student5(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public int getRollno()
    {
        return rollno;
    }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

     @Override
     public String toString()
     {
         return "Student5{" +
                 "rollno=" + rollno +
                 ", name='" + name + '\'' +
                 '}';
     }
 }

public class Function2
{
    public static void main(String[] args)
    {
        Student5 s1 = new Student5("Ashish", 10);
        Student5 s2 = new Student5("Pratik", 20);
        Student5 s3 = new Student5("Ashwarya", 30);
        List<Student5> list = Arrays.asList(s1, s2, s3);
        Function<String, String> function = x -> x.substring(0, 3);
        Function<List<Student5>, List<Student5>> studentsWithAshAsPrefix = li -> {
            List<Student5> list2 = new ArrayList<>();
            for (Student5 s : li) {
                if (function.apply(s.getName()).equalsIgnoreCase("ash")) {
                    list2.add(s);
                }
            }
            return list2;
        };
            List<Student5> filteredStudent = studentsWithAshAsPrefix.apply(list);
            System.out.println(filteredStudent);


            Function<String, String> function1 = s -> s.toUpperCase();
            Function<String, String> function2 = s -> s.substring(0,3);
            Function<String, String> stringStringFunction = function1.andThen(function2);
            System.out.println(stringStringFunction.apply("ashish"));
    }
}
