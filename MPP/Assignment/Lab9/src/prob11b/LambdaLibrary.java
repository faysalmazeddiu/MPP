package prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static TriFunction<List<Employee>, Integer, String, String> result = (emps, salary, charRange) -> {
		return emps.stream().filter(e -> {
			return e.getSalary() > salary && e.getLastName().matches("^[" + charRange + "].*");

		}).sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.map(e -> e.getFirstName() + " " + e.getLastName()).collect(Collectors.joining(", "));
	};
}
