import java.util.function.Predicate;

class Student4{
    public String name;
    public int id;

    Student4(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId()
    {
        return id;
    }
}
public class Predicates2 {
    public static void main(String[] args)
    {
        Student4 s1 = new Student4("Ashish", 1);
        Student4 s2 = new Student4("Pratik" , 2);
        Predicate<Student4> predicate = x -> x.getId() > 1;
        System.out.println(predicate.test(s2));
        Predicate<Student4> string1 = x -> x.getName().toLowerCase().charAt(0) == 'a';
        Predicate<Student4> string2 = x -> x.getName().toLowerCase().charAt(x.getName().length() - 1) == 'h';
        Predicate<Student4> or = string1.or(string2);
        System.out.println(or.test(s2));
        System.out.println(or.test(s1));
    }
}
