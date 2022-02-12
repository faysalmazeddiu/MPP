package prog2;

public class Ellipse implements ClosedCurve {

	private double semiMajorAxis;
	private double ellip;

	public Ellipse(double a, double e) {
		this.semiMajorAxis = a;
		this.ellip = e;
	}

	public double getA() {
		return semiMajorAxis;
	}

	public void setA(double a) {
		this.semiMajorAxis = a;
	}

	public double getE() {
		return ellip;
	}

	public void setE(double e) {
		this.ellip = e;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellip;
	}
}
