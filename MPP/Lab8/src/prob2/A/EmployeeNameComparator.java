package prob2.A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
