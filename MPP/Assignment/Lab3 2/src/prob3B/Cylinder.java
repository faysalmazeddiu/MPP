package prob3B;

public class Cylinder {
	
	private Circle circle;
	private double height;
	public Cylinder(double radius, double height) {
		this.height = height;
		this.circle = new Circle(radius);
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public double computeVolume() {
		return circle.computeArea() * height;
	}
	

}
