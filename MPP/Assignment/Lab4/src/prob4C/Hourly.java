package prob4C;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(String employeeId, double hourlyBaseWage, double hoursBasePerWeek) {
		super(employeeId);
		this.hourlyWage = hourlyBaseWage;
		this.hoursPerWeek = hoursBasePerWeek;
	}

	@Override
	double calcGrossPay(int month, int year) {
		double grossPayment=this.hourlyWage * this.hoursPerWeek * 4;
		return grossPayment;
	}

}
