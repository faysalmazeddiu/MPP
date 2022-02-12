package prob5.soln1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

import prob5.Employee;

public class TestProb5Soln1 {
	
	@Test
    public void testAsString(){
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), new Employee("Donald", "Trump", 100000)).stream();
		String result = (new Prob5Soln1()).asString(emps);
		String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
		assertEquals(expected, result);
    }

}
