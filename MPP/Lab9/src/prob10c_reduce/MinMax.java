package prob10c_reduce;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinMax {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.of(11,34,6,1,0);
		
		IntSummaryStatistics summary = intStream.summaryStatistics();
		System.out.println(String.format("Max : %d \nMin: %d", summary.getMax(), summary.getMin()));
		
		//System.out.println(intStream.reduce(0,(c1,c2)->c1>c2?c1:c2));
		System.out.println(summary.getMax());
		//intStream.summaryStatistics().getMax();
		
	}

}
