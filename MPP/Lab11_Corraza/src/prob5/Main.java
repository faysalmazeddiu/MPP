package prob5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(4, 2, 3, 6);
		System.out.println(secondSmallestTwo(listOfIntegers));
		
		List<Employee> listOfEmployee 
		  = Arrays.asList(new Employee("Mazed", 60000), new Employee("Sazed", 300000));
		
		System.out.println(secondSmallestTwo(listOfEmployee));
		
		List<LocalDate> dates = Arrays.asList(LocalDate.of(1900, 1, 1), LocalDate.of(1950,1,1),
				LocalDate.of(1975, 1, 1), LocalDate.of(2000, 1, 1));
		System.out.println(secondSmallestThree(dates));

	}
	
	public static Integer secondSmallest(List<Integer> listObj) {
		int smallest = listObj.get(0);
		int secondSmallest = listObj.get(1);
		if (smallest > secondSmallest) {
			int temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for (int i = 2; i < listObj.size(); ++i) {
			int next = listObj.get(i);
			if (next < smallest) {
				secondSmallest = smallest;
				smallest = next;
			} else if (next < secondSmallest) {
				secondSmallest = next;
			}

		}
		return secondSmallest;
	}


	public static <T extends Comparable<T>> T secondSmallestTwo(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest) > 0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest) < 0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	public static <T extends Comparable<? super T>> T secondSmallestThree(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest) > 0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}

}
