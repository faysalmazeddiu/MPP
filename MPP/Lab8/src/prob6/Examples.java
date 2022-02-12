package prob6;

import java.util.Comparator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;






public class Examples {
	
	public static void main(String[] args) {
		Examples examples = new Examples();
		examples.evaluator();
	}
	
	// A. (Employee e) -> e.getName()
	Function<Employee, String> efunction = Employee::getName;

	// B. (Employee e,String s) -> e.setName(s)
	BiConsumer<Employee, String> nameSetterConsumer = Employee::setName;

	// C. (String s1,String s2) -> s1.compareTo(s2)
	BiFunction<String, String, Integer> biFunc = String::compareTo;

	// D. (Integer x,Integer y) -> Math.pow(x,y)
	BiFunction<Integer, Integer, Double> powBiFunc = Math::pow;

	// E. (Apple a) -> a.getWeight()
	Function<Apple, Double> appleWeightFun = Apple::getWeight;

	// F. (String x) -> Integer.parseInt(x);
	Function<String, Integer> parseIntFunc = Integer::parseInt;
	

	// G. EmployeeNameComparator comp = new EmployeeNameComparator();
	// (Employee e1, Employee e2) -> comp.compare(e1,e2)
	
	
	EmployeeNameComparator empCom = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> bifEmployee = empCom::compare;

    public void evaluator() {
		//A. 
		System.out.println(efunction.apply(new Employee("Md Mazed")));
			
		//B.
		Employee emp1 = new Employee();
		nameSetterConsumer.accept(emp1, "Md zahid");
		System.out.println(emp1.getName());
		
		//C.
		System.out.println(biFunc.apply("joe", "joe"));
		
		//D.
		System.out.println(powBiFunc.apply(4, 2));
		
		//E.
		System.out.println(appleWeightFun.apply(new Apple(20.0)));
				
		//F.
		System.out.println(parseIntFunc.apply("22"));
				
		
		Employee emp2 = new Employee("Andrex");
		Employee emp3 = new Employee("Andrex");
		
		//G.
		System.out.println(empCom.compare(emp2, emp3));
	}

	
}


class Employee {
	private String name;
	
	public Employee() {
		
	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}



class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}



class Apple {
	private Double weight;
	
	public Apple(Double weight) {
		this.weight = weight;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}





