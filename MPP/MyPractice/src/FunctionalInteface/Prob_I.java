package FunctionalInteface;

import java.util.function.Supplier;

public class Prob_I {

	public static void main(String[] args) {
		Supplier<Double> supplier = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
			
		};
		//Supplier<Double> supplier = ()->{return Math.random();};
		
		System.out.println(supplier.get());
	}

}
