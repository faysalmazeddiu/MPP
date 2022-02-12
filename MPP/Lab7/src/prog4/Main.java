package prog4;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), 
				new RubberDuck()};
		for (Duck obj : ducks) {
			System.out.println(obj.getClass().getSimpleName()+":\n");
			obj.display();
			obj.quack();
			obj.fly();
			obj.swim();
			System.out.println("\n");
		}

	}

}
