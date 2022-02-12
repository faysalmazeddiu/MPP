package prob2.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				if (method == SortMethod.BYNAME) {

					int retValue = emp1.name.compareTo(emp2.name);

					if (retValue == 0) {
						if (emp1.salary == emp2.salary) {
							retValue = 0;
						} else if (emp1.salary < emp2.salary) {
							retValue = -1;
						} else {
							retValue = 1;
						}
					}

					return retValue;
				} else {
					if (emp1.salary == emp2.salary) {
						return 0;
					} else if (emp1.salary < emp2.salary) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);

		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);

		Employee e = new Employee("Joe", 100000);
		Employee emp1 = new Employee("Joe", 100000);
		System.out.println(emp1.compareEmp.test(e));

	}
}
