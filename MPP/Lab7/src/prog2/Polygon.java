package prog2;

public interface Polygon extends ClosedCurve {
	
	public double[] getSides();

	public default double computePerimeter() {
		double totalPerimeter = 0;
		double[] sideArr = getSides();
		for (double sideVal : sideArr) {
			totalPerimeter += sideVal;
		}
		return totalPerimeter;
	}
}
