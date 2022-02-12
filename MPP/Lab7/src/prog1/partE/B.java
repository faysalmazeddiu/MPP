package prog1.partE;

public interface B extends A{
    @Override
    default void method() {
    	System.out.println("Display-B");
    }
}
