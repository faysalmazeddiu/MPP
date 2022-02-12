package prog1.partE;

public interface C extends A{
	@Override
	default void method() {
		System.out.println("Display-C");
	}
}
