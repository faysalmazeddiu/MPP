package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindingSecondSmallest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,23,9,11,22,1);
        System.out.println(secondSmallest(list));
        List<String> list2= Arrays.asList("z","s","e","w");
        System.out.println(secondSmallest(list2));
	}

	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		Collections.sort(list);
		return list.get(1);
	}
}
