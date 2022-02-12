package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionProg {
	
	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> bifunction =(x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;

		};

		List<Double> returnVal = bifunction.apply(2.0, 3.0);
		System.out.println(returnVal);
	}

}
