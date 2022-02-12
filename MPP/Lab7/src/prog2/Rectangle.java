package prog2;

public class Rectangle implements Polygon {
	private double length; 
	private double width;


	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;

	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double l) {
		this.length = l;
	}
	

	@Override
	public double[] getSides() {
		return new double[] { length, width, length, width };
	}



	public double getWidth() {
		return width;
	}

	public void setWidth(double w) {
		this.width = w;
	}

}
