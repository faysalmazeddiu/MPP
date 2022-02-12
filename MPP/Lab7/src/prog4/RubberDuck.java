package prog4;

public class RubberDuck extends Duck implements Quack, CannotFly{
	
	public RubberDuck() {
		
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - RubberDuck");
	}

}
