package prog4;

public abstract interface Quack extends QuackBehavior{

	@Override
	public default void quack() {
		System.out.println("squeaking");
	}

}
