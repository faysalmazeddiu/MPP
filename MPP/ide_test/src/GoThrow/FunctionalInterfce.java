package GoThrow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfce {


    public static void main(String[] args) {
        List<Employee> employeeList1=new ArrayList<>();
        employeeList1.add(new Employee("Nusrat",600000));
        employeeList1.add(new Employee("Ayub",2000000));

        List<Employee> employeeList2=new ArrayList<>();

        employeeList2.add(new Employee("Nusrat",600000));
        employeeList2.add(new Employee("Ayub",2000000));

        List<Employee> employeeList3=new ArrayList<>();
        employeeList3.add(new Employee("mazed",20000));
        employeeList3.add(new Employee("Mahabub",50000));
        employeeList3.add(new Employee("Rimon",1000000));
        employeeList3.add(new Employee("Anwar",800000));


        List<List<Employee>> doubleList = new ArrayList<>();
        doubleList.add(employeeList1);
        doubleList.add(employeeList2);
        doubleList.add(employeeList3);

        System.out.println(doubleList.toString());
//        List<String> employeeListfinal=employeeList.stream().
//                filter((Employee e)->e.getName().startsWith("A")).map((Employee e)->e.getName()+" Hossain")
//                .collect(Collectors.toList());
//        employeeList2.forEach(s->System.out.println(s));

        List<String> employeeList=doubleList.stream().flatMap((l)->l.stream()).map((l)->l.getName()).collect(Collectors.toList());
        System.out.println(employeeList);

    }








//    @Override
//    public int compare(String o1, String o2) {
//        return 0;
//    }
}

class Employee{
    private String name;
    private double salary;


    public Employee(String name,double salary) {
        this.name = name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

