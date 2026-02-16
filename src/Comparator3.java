import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa()
    {
        return gpa;
    }
}


public class Comparator3
{
    public static void main(String[] args)
    {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Ashish", 3.7));
        stud.add(new Student("Pratik", 3.5));
        stud.add(new Student("Akshay", 3.9));
        stud.add(new Student("Akash", 3.5));
        stud.sort((o1, o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0 ){
                return -1;
            }
            else
            return o1.getName().compareTo(o2.getName());
        });
        for(Student s : stud){
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }

}
