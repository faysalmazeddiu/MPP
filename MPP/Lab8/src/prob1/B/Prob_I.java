package prob1.B;

import java.util.function.Supplier;

public class Prob_I {

	public static void main(String[] args) {

		Supplier<Double> supplier = ()->{return Math.random();};
		
		System.out.println(supplier.get());
		
	}

}
