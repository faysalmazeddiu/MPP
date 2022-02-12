package prog2;

public class Circle implements ClosedCurve {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}


	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}
}
