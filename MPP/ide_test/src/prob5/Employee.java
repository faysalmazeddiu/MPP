package prob5;

public class Employee implements Comparable<Employee> {
	private String name;
	private int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "(" + name + ":" + salary + ")";
	}

	
	@Override
	public int compareTo(Employee e) {

		if (this.getName().compareTo(e.getName()) > 0) {
			return 1;
		} else if (this.getName().compareTo(e.getName()) < 0)
			return -1;
		else {
			if (this.getSalary()>e.getSalary()) {
				return 1;
			} else if (this.getSalary()<e.getSalary()) {
				return -1;
			} else
				return 0;
		}
	}
	

}
