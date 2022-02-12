package prob2;

final class Ractangle implements Shape{
	private final double width;
	private final double height; 
	public Ractangle(double width, double height) {
		this.height=height;
		this.width=width;
	}
	public double getLength() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	@Override
	public double computeArea() {
		return width * height;
	}
}
