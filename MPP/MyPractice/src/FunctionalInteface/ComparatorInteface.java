package FunctionalInteface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	private int salary;
	private String name;
	Employee(int salary, String name){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}

/*class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}*/
public class ComparatorInteface {
	public static void main(String[] args) {
		List<Employee> listOfEmployee=new ArrayList<>();
		listOfEmployee.add(new Employee(20000,"Mazed"));
		listOfEmployee.add(new Employee(10000,"Sajib"));
		listOfEmployee.add(new Employee(50000,"Sazed"));
		
		Comparator<Employee> cE=(Employee o1, Employee o2)->o1.getName().compareTo(o2.getName());
				/*if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}else {
					return 0;
				}*/
				
			
		
			Collections.sort(listOfEmployee,cE);
			listOfEmployee.forEach((e)->System.out.println(e.getName()+"==="+e.getSalary()));
		/*
		// another way
		Comparator<Employee> cE=new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}else {
					return 0;
				}
				
			}
		};
		*/
		
		//System.out.println(cE.compare(new Employee(20000,"Mazed"), new Employee(10000,"Sajib")));
		
		
		
		//one way
		/*Collections.sort(listOfEmployee,new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}else {
					return 0;
				}
				
			}
		});*/
		
		
		//listOfEmployee.forEach((e)->System.out.println(e.getName()+"==="+e.getSalary()));
	}
	
}
