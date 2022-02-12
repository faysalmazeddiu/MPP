package prob5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

		//(a) use of lambda expression
		list.forEach(s -> System.out.print(s.toUpperCase() + ", "));
		
		System.out.println("\n");
		
		//(b) use of method reference 
		list.forEach(ForEachExample::printUpper);

	}
	
	static void printUpper(String string) {
		System.out.print(string.toUpperCase() + ",");
	}

}
