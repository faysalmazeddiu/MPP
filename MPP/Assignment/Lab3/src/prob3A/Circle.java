package prob3A;

public class Circle extends Cylinder{
	private double radius;   // based on given UML
	public Circle(double radius) {
		super(radius, 0.0);
		this.radius=radius;
		
	}
	
	public double getRadius() {
		//return super.getRadius();
		return radius;  // based on given UML
	}
	
	public double computeArea() {
		double area = Math.PI*Math.pow(this.getRadius(), 2);
		return area;
	}
	
	
	
}
