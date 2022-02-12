package prob2.B;

import java.util.function.Predicate;

public class Employee {
	String name;
	int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public Predicate<Employee> compareEmp = this::equals;

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || object.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee) object;
		return e.name.equals(this.name) && e.salary == this.salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary);
		return sb.toString();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

}

