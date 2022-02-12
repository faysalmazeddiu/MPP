package prog2;

public class EquilateralTriangle implements Polygon {

	private double side;

	EquilateralTriangle(double sideParam) {
		this.side = sideParam;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double sideParam) {
		this.side = sideParam;
	}

	@Override
	public double[] getSides() {
		return new double[] { side, side, side };
	}

}
