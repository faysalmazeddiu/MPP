package prob2;

final class Triangle implements Shape{
	private final double base;
	private final double height;
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	@Override
	public double computeArea() {
		
		return   (base * height)/2;
	}
	

}
