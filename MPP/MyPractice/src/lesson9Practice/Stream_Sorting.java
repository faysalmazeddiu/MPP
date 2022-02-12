package lesson9Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;



public class Stream_Sorting {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Mazed", "Fahad","Abir", "tom", "Cidar");
		
		// based on word
		/*
		list.stream().sorted((x,y)->{
			if(x.compareTo(y)>0) return 1;
			else if(x.compareTo(y)<0) return -1;
			else return 0;
		}).forEach(System.out::println);
		*/
		System.out.println("\n");
		/*
		// based on length
		list.stream().sorted((x,y)->{
			if(x.length()>y.length()) return 1;
			else if(x.length()<y.length()) return -1;
			else return 0;
		}).forEach(System.out::println);
		
		System.out.println("\n");
		*/
		
		// based on length (anther way)
		//list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		//list.stream().sorted().forEach(System.out::println);
		System.out.println("\n");
		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee("Mazed",20000)) ;
		employeeList.add(new Employee("Abir",15000)) ;	
		employeeList.add(new Employee("Baron",50000)) ;
		employeeList.add(new Employee("Sazed",30000)) ;
		employeeList.add(new Employee("Abgail",6000)) ;
		employeeList.add(new Employee("Billu",70000)) ;
		employeeList.add(new Employee("Mahir",10000)) ;
		
		// Sort By Name
		
		//Stream<Employee> emp=employeeList.stream()
			employeeList.stream()
					.sorted(Comparator.comparing(Employee::getName))
//					.sorted((x,y)->{
//						if(x.getName().compareTo(y.getName())>0) return 1;
//						else if(x.getName().compareTo(y.getName())<0) return -1;
//						else return 0;
//					})
					.forEach(s->System.out.println(s.getName()+"==="+s.getSalary()));
		
		System.out.println("\n");
		
		// Sort By salary
		employeeList.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(s->System.out.println(s.getName()+"==="+s.getSalary()));
		
		System.out.println("\n");
		// sort by name salary together
		Employee.sort(employeeList, "name");
		
	}
}


class Employee{
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public static void sort(List<Employee> empList,String sortMethod) {
		if(sortMethod=="name") {
			Collections.sort(empList, Comparator.comparing(Employee::getName)
					.thenComparing(Employee::getSalary));
		}else {
			Collections.sort(empList, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		}
		empList.forEach(s-> System.out.println(s.getName()+"===="+s.getSalary()));
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]\n";
	}
	
	
	
}
