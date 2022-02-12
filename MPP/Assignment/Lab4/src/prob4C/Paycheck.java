package prob4C;

public class Paycheck {
	private double grossPay;
	final double local = 0.01;
	final double medicare = 0.03;
	private int month;
	private int year;
	final double socialSecurity = 0.075;
	final double fica = 0.23;
	final double state = 0.05;
	
	
	public Paycheck(double grossPayment) {
		this.grossPay = grossPayment;
	}


	public double getNetPay() {
		double basicNeedPayment=fica + state + local + medicare + socialSecurity;
		return grossPay - grossPay * basicNeedPayment;
	}


	public void print() {
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		
		
		return "PayStub: \n" + "Gross Payment=" + grossPay + ", FICA=" + fica + " , State=" + state + " , Local=" + local
				+ " , \nMedicare=" + medicare + ", Social Security=" + socialSecurity + ", Net Payment=" + getNetPay();
	}

}
