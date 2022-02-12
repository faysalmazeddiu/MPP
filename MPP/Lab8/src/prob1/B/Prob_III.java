package prob1.B;

import java.util.function.Supplier;

public class Prob_III {
	
	class GenRandom implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}

	public static void main(String[] args) {
		GenRandom genRand = new Prob_III().new GenRandom();
		System.out.println(genRand.get());
	}

}
