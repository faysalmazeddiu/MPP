package prob1;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	BiPredicate<Double, Double> biPredicate=(Double x, Double y) -> x * y < x + y;
	
	BiFunction<Double, Double, Boolean> biFunction=(Double x, Double y) -> x * y < x + y;
	
	// representing lambda as a method reference
	BiPredicate<Double, Double> biPredicate1=Problem1::checkCondition;
	
	BiFunction<Double, Double, Boolean> biFunction1=Problem1::checkCondition;
	
	public static boolean checkCondition(Double x,Double y){
		return x*y < x+y ;
	}
	
	//representing lambda as a static nested class
	
	static class BiPredicateClass implements BiPredicate<Double, Double>{

		@Override
		public boolean test(Double x, Double y) {
			
			return x * y < x + y;
		}
		
	}
	
	static class BiFunctionClass implements BiFunction<Double, Double, Boolean>{

		@Override
		public Boolean apply(Double x, Double y) {
			
			return x * y < x + y;
		}

		
		
	}
	
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		double x=2;
		double y=7;
		// using Bipredicate
		System.out.println(biPredicate.test(x, y));
		System.out.println(biPredicate1.test(x, y));
		System.out.println(new BiPredicateClass().test(x, y));
		
		// using BiFuction
		System.out.println(biFunction.apply(x, y));
		System.out.println(biFunction1.apply(x, y));
		System.out.println(new BiFunctionClass().apply(x, y));
		
		
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
