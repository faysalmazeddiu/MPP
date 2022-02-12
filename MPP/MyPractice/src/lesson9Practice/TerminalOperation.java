package lesson9Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args){

        // findFirst()
       String str=Stream.of("Mazed", "sazed","Mamun","Tom","Shohel").filter(s->s.startsWith("M"))
                .map(x->x).findFirst().get();
        System.out.println(str);

        // findAny
        String str2=Stream.of("Mazed", "sazed","Mamun","Tom","Shohel").filter(s->s.startsWith("M"))
                .map(x->x).findAny().get();
        System.out.println(str2);

        System.out.println("\n");

        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Mostafiz",30000));
        studentList.add(new Student("Shohel",45000));
        studentList.add(new Student("Abir",50000));
        studentList.add(new Student("Helaly",20000));


        // get student whose schloarship less than 40000
       List<Student> filteredList= studentList.stream()
                .filter(s->s.getSchMoney()<40000)
                .collect(Collectors.toList());
        filteredList.forEach(s->System.out.println(s.getName()+"====>"+s.getSchMoney()));

        System.out.println("\n");

        // max and min and count

        // count
        System.out.println(studentList.stream()
                .filter(s->s.getSchMoney()<40000)
                .count());

        System.out.println("\n");

        //max
        Student student=studentList.stream().max(Comparator.comparing(s->s.getSchMoney())).get();
        System.out.println(student.getName()+"====="+student.getSchMoney());

        //min
        Student student2=studentList.stream().min(Comparator.comparing(s->s.getSchMoney())).get();
        System.out.println(student2.getName()+"====="+student2.getSchMoney());

        // reduce
        int sum=Stream.of(2,3,4,5).reduce(0,(x,y)->x+y);
        System.out.println(sum);
        System.out.println(Stream.of(2,3,4,5).reduce((x,y)->x+y).get());
    }

}

class Student{
    public enum SortMethod{
        BYNAME,BYSCH;
    }
    private String name;
    private double schMoney;

    public Student(String name, double schMoney) {
        this.name = name;
        this.schMoney = schMoney;
    }

    public String getName() {
        return name;
    }

    public double getSchMoney() {
        return schMoney;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schMoney=" + schMoney +
                '}';
    }
}
