import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1{
    public int id;
    public String name;

    public Student1(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return this.id + " : " + this.name;
    }
}

public class Comparator5
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1(3, "Ashish");
        Student1 s2 = new Student1(45, "Pratik");
        Student1 s3 = new Student1(6, "Akash");
        List<Student1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, (a, b) -> b.id - a.id);
        System.out.println(list);
    }
}
