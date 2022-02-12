package prob10a_reduce;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue(list));
	}
	

	
	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().map(s -> s.flag).reduce(false, (x, y) -> x || y);

	}

}
