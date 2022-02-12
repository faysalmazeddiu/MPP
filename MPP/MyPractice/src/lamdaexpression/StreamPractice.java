package lamdaexpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
	public static void main(String[] args) {
		Integer[] arr= {34,12,8,3,1,56,23,45};
		
		/*
			int minimumVal=Stream.of(arr).mapToInt(el->el).min().getAsInt(); // one way
			System.out.println(minimumVal);
			int min=Stream.of(arr).min(Comparator.comparing(Integer::intValue)).get(); // another way
			System.out.println(min);
		*/
		
		// start up way max and min identification
		/*
			int mini=Stream.of(arr).min((e1,e2)->{
				if(e1>e2) return 1;
				else return -1;
			}).get();
			System.out.println(mini);
			
			int max=Stream.of(arr).max((e1,e2)->{
				if(e1>e2) return 1;
				else return -1;
			}).get();
			System.out.println(max);
		*/
		// filter and mapping
		
		/*
			Stream<Integer> arrStream=Stream.of(arr);
			List<Integer> list=arrStream
								.filter(x-> x>=5 && x<8)
								.map(x->x*6)
								.collect(Collectors.toList());
			System.out.println(list);
		*/
		
		
		// sorting  by default
		/*
			List<Integer> integerList=Stream.of(arr).sorted().collect(Collectors.toList());
			System.out.println(integerList);
		*/
		
		
		/*
		// Object[] to Array conversion
		
			String[] arrString= {"Mazed", "sazed", "Amir","B"};
			String[] newArr=Stream.of(arrString).sorted().toArray(String[]::new);
			for(String s:newArr) {
				System.out.println(s);
			}
		*/
		// max and min
		
		/*
			String maxString=Stream.of(arrString).max((e1,e2)->{
				if(e1.compareTo(e2)>0) return 1;
				else  return -1;
			}
				//e1.compareTo(e2)
			).get();
			System.out.println(maxString);
			
			String minString=Stream.of(arrString).min((e1,e2)->{
				if(e1.compareTo(e2)>0) return 1;
				else  return -1;
			}
			//e1.compareTo(e2))
			).get();
			System.out.println(minString);
			
		*/
		
		
		// sorting  by default
		/*
		List<String> stringList=Stream.of(arrString).sorted().collect(Collectors.toList());
		System.out.println(stringList);
		*/
		
		// filter and mapping 
		/*
			
			List<String> stringList=Stream.of(arrString)
										.filter(x-> x.length()==5).map(x->x+" Student")
										.collect(Collectors.toList());
			
			stringList.forEach(l->System.out.println(l));
		*/
		
		
		System.out.println("\n");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee("Mazed",20000)) ;
		employeeList.add(new Employee("Sajib",15000)) ;
		employeeList.add(new Employee("Sazed",30000)) ;
		employeeList.add(new Employee("Mostafiz",70000)) ;
		
		List<Employee> employeeList2=new ArrayList<Employee>();
		employeeList2.add(new Employee("Fahad",80000)) ;
		employeeList2.add(new Employee("Rasel",100000)) ;
		employeeList2.add(new Employee("Halaly",500000)) ;
		
		List<Employee> employeeList3=new ArrayList<Employee>();
		employeeList2.add(new Employee("Milon",56000)) ;
		employeeList2.add(new Employee("Kiron",60000)) ;
		employeeList2.add(new Employee("Mamun",40000)) ;
		
		List<List<Employee>> employObj=new ArrayList<List<Employee>>();
		employObj.add(employeeList);
		employObj.add(employeeList2);
		employObj.add(employeeList3);
		
		
		
		
		
		
		
		/*
		
		// flatMap() is for converting "Collection<Collection<Employee>>" to collection of stream
		List<Double> salaryList=employObj.stream()
								.flatMap(emp->emp.stream())
								.filter(x-> x.getSalary()>70000)
								.map(s-> s.getSalary()*2)
								.collect(Collectors.toList());
		salaryList.forEach(System.out::println);
		
		*/
		// count
		//System.out.println("The use of count "+employeeList.stream().filter(e->e.getSalary()>50000).count());
		
		/*
		 
		// min and max
		Employee employeeList2=employeeList.stream().min((e1,e2)->{
			if(e1.getName().compareTo(e2.getName())>0) return 1;
			else return -1;
		}).get();
		
		System.out.println(employeeList2);
		
		Employee employeeList3=employeeList.stream().min((e1,e2)->{
			if(e1.getSalary()>e2.getSalary()) return 1;
			else return -1;
		}).get();
		
		System.out.println(employeeList3);
		
		
		
		*/
		
		
		/*
		
		// sort by comparator with employee name
		List<Employee> employeeList2=employeeList.stream()
										.sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
										.collect(Collectors.toList());
		
		System.out.println(employeeList2.toString());
		
		// sort by comparator with employee salary
		List<Employee> employeeList3=employeeList.stream()
										.sorted((e1,e2)-> { // it internally invokes compairTo() method from Comparator Inteface
											if(e1.getSalary()>e2.getSalary()) {
												return 1;
											}
											else if(e1.getSalary()<e2.getSalary()) {
												return -1;
											}
											else {
												return 0;
											}
										})
										.collect(Collectors.toList());
		System.out.println(employeeList3.toString());
		
		// sort by comparator with employee salary reverseOrder
		List<Employee> employeeList4=employeeList.stream()
				.sorted((e1,e2)-> { // it internally invokes compairTo() method from Comparator Inteface
					if(e1.getSalary()>e2.getSalary()) {
						return -1;
					}
					else if(e1.getSalary()<e2.getSalary()) {
						return 1;
					}
					else {
						return 0;
					}
				})
				.collect(Collectors.toList());
			System.out.println(employeeList4.toString());
			
		*/
		
		// filter and mapping 
		/*
			List<Double> listOfSalary=employeeList.stream()
						.filter(x->x.getSalary()<=30000)
						.map(x->x.getSalary()+10000)
						.collect(Collectors.toList());
			
			listOfSalary.forEach(x-> System.out.println(x));
		*/
		
		// distinct 
		Integer[] intArr= {23,12,1,4,5,5,5,5};
		//List<Integer> modifyList=Stream.of(intArr).distinct().collect(Collectors.toList());
		Integer[] modifyList=Stream.of(intArr).distinct().toArray(Integer[]::new);
		for(Integer a:modifyList) {
			System.out.println(a);
		}
		
		/*
		 
		// limit
		String[] arrString= {"Mazed","A","B","C", "1","2"};
		Stream.of(arrString).limit(2).forEach(System.out::println);
		
		System.out.println("\n");
		
		// reduce
		Optional<String> combinedString=Stream.of(arrString).reduce((value, combinaor)->{
			//System.out.println(value+"===="+combinaor);
			return value+combinaor;
		});
		
		System.out.println(combinedString.get());
		
		System.out.println("\n");
		// 
		Integer[] intArr2= {12,23,56,34,67};
		int sum=Stream.of(intArr2).reduce((value, combinaor)->{
			return value+combinaor;
		}).get();
		System.out.println(sum);
		
		*/
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]\n";
	}
	
	
	
}
