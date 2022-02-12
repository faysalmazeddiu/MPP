package SOLID.src.ocp.good;

public class Substraction implements Operation{
	public double a;
	public double b;
	public double result;
	
	public Substraction(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void perform() {
		this.result = this.a + this.b;
	}
}
