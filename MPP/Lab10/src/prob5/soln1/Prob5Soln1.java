package prob5.soln1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prob5.Employee;

public class Prob5Soln1 {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), new Employee("Donald", "Trump", 100000)).stream();
		Prob5Soln1 soln1 = new Prob5Soln1();
		soln1.printEmps(emps);

	}

	public void printEmps(Stream<Employee> emps) {
		System.out.println(asString(emps));
	}

	public String asString(Stream<Employee> emps) {
		return emps.filter(e -> (e.getSalary() > 100000)).filter(e -> (e.getLastName().charAt(0) > 'M'))
				.map(e -> fullName(e)).sorted().collect(Collectors.joining(", "));
	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
