package prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MinMax {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.of(11,34,6,1,0);
		
		IntSummaryStatistics summary = intStream.summaryStatistics();
		System.out.println(String.format("Max : %d \nMin: %d", summary.getMax(), summary.getMin()));
	}

}
