package prob3B;

public class Test {
	public static void main(String[] args) {
		Cylinder cylinderObj=new Cylinder(12,4);
		System.out.println(cylinderObj.computeVolume());
		System.out.println(cylinderObj.getCircle().computeArea());
	}
}
