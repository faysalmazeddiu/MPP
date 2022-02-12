package prob4C;

public abstract class Employee {
	
	private String employeeId;
	abstract double calcGrossPay(int month, int year);

	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	public void print(int month, int year) {
		Paycheck paycheckObj = calcCompensation(month, year);
		System.out.println("Month: " + month + " Year: " + year);
		System.out.println("employee id is : " + getEmpId());
		System.out.println(paycheckObj);
		System.out.println();
	}

	public String getEmpId() {
		return this.employeeId;
	}
	
	public Paycheck calcCompensation(int month, int year) {
		double grossPay=calcGrossPay(month, year);
		Paycheck payCkeckObj=new Paycheck(grossPay);
		return payCkeckObj;
	}

	
}
