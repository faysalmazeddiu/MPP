package prob4C;

public class Salaried extends Employee{
	private double salary;

	public Salaried(String employeeId, double salaryVal) {
		super(employeeId);
		this.salary = salaryVal;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return this.salary;
	}
}
