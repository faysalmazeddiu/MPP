package prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		 List<Shape> listShapes=new ArrayList<>();
		 listShapes.add(new Circle(3));
		 listShapes.add(new Ractangle(2,4));
		 listShapes.add(new Triangle(4,6));
		 
		 double sum=0.0;
		 for(Shape s:listShapes) {
			 sum+=s.computeArea();
		 }
		 System.out.println(sum);
		  
	}

}
