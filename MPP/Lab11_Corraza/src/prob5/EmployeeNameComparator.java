package prob5;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getName().compareTo(emp2.getName()) != 0)
			return emp1.getName().compareTo(emp2.getName());
		return emp1.getSalary() < emp2.getSalary() ? -1 : emp2.getSalary() == emp2.getSalary() ? 0 : 1;
	}
}
