package prob5;

import java.time.LocalDate;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		testIntegers();
		testStrings();
		testEmployees();
		testLocalDates();
	}
	
	public static void testIntegers() {
		List<Integer> ints = Arrays.asList(4, 8, -2);
		List<Pair<Integer, Integer>> pairList = AllPairs.allIncreasingPairs(ints);
		System.out.println(pairList);
	}
	
	public static void testStrings() {
		 List<String> strs = Arrays.asList("Bob", "Alice", "Steve");
		 //uncomment when ready
		 List<Pair<String, String>> pairList = AllPairs.allIncreasingPairs2(strs,(s1,s2) -> s1.compareTo(s2));
		 System.out.println(pairList);
		 
	}
	
	public static void testLocalDates() {
		
		 List<LocalDate> dates = Arrays.asList(LocalDate.of(1994, 1, 2), 
				 LocalDate.of(2003, 9, 11), LocalDate.of(2001, 4, 15));
		 //uncomment when ready
		
		 List<Pair<LocalDate, LocalDate>> pairList = AllPairs.allIncreasingPairs2(dates,(l1,l2) -> l1.compareTo(l2));
		 System.out.println(pairList);
		 
	}
	public static void testEmployees() {		
		 List<Employee> emps = Arrays.asList(new Employee("Bob", 100000), new Employee("Jim", 55000), 
				 new Employee("Adrian", 90000), new Employee("Jim", 60000));
		 //complete implementation of test when ready
		 Comparator<Employee> comparator=(e1,e2)->{
				if (e1.getName().compareTo(e2.getName()) > 0) {
					return 1;
				} else if (e1.getName().compareTo(e2.getName()) < 0)
					return -1;
				else {
					if (e1.getSalary()>e2.getSalary()) {
						return 1;
					} else if (e1.getSalary()<e2.getSalary()) {
						return -1;
					} else
						return 0;
				}
			};
			List<Pair<Employee, Employee>> pairList = AllPairs.allIncreasingPairs2(emps,comparator);
			System.out.println(pairList);
		 
	}
}
