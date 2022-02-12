package prob11B;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import prob11A.Employee;
import prob11A.TriFunction;


public class Main {
	
	public static final TriFunction<List<Employee>, String, Integer, String> SELECTED_EMPLOYEES = (emps, lettersRange,
			salary) -> emps.stream()

					.filter(e -> e.getSalary() > salary)
					.filter(e -> Pattern.compile("\\A[" + lettersRange + "]").matcher(e.getLastName()).find())
					.sorted(Comparator.comparing(Employee::getFirstName))
					.map(e -> e.getFirstName().concat(" " + e.getLastName())).collect(Collectors.joining(", "));

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		String lettersRange = "N-Z";
		Integer salary = 100000;

		System.out.println("\n  ");
		String specialEmployee2 = SELECTED_EMPLOYEES.apply(list, lettersRange, salary);
		System.out.println(specialEmployee2);
		
	}

}
