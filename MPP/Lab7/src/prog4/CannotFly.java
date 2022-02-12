package prog4;

public interface CannotFly extends FlyBehavior{

	@Override
	public default void fly() {
		System.out.println("cannot fly");
	}

}
