import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2 implements Comparable<Student2>{
    String name;
    int marks;

    public Student2(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return name + " : " + marks;
    }

    @Override
    public int compareTo(Student2 o)
    {
        return this.marks - o.marks;
    }
}


public class Comparable1
{
    public static void main(String[] args)
    {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Ashish", 96));
        list.add(new Student2("Pratik", 94));
        list.add(new Student2("Akash", 97));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
