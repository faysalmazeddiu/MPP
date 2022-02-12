package prob2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {

	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, SortMethod method) {

		Collections.sort(emps, (emp1, emp2) -> {
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
		});
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
