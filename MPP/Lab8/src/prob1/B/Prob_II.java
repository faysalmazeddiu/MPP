package prob1.B;

import java.util.function.Supplier;

public class Prob_II {

	public static void main(String[] args) {
		Supplier<Double> suppiler = Math::random;
		System.out.println(suppiler.get());
	}

}
