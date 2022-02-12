package prog4;

public abstract class Duck implements FlyBehavior, QuackBehavior {

	abstract public void display();
	
	public Duck() {
	}
	
	public void swim() {
		System.out.println("swimming");
	};

	

}
