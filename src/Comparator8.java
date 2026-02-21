import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student3{
    public Integer id;
    public String name;

    public Student3(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + " : " + this.name;
    }
}

public class Comparator8
{
    public static void main(String[] args)
    {
        Student3 s1 = new Student3(22, "Ashish");
        Student3 s2 = new Student3(19, "Pratik");
        Student3 s3 = new Student3(33, "Darshan");
        Student3 s4 = new Student3(25, "Akshay");
        List<Student3> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list, (a,b) -> b.id - a.id);
        System.out.println(list);
    }
}
