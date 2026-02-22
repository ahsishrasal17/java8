import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student6{
    private String name;

    Student6(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }
}


public class ContructorReference {
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Ashish","Pratik","Akshay");
        List<Student6> collect = names.stream().map(Student6::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}
