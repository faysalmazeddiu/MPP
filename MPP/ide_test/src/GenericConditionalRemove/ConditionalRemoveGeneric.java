package GenericConditionalRemove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ConditionalRemoveGeneric {
	static class StrLengthCondition implements Predicate<String> {
		public boolean test(String s) {
			return s.length() == 6;
		}
	}
	
	static class StrLengthCondition2 implements Predicate<String> {
		public boolean test(String s) {
			if (s.contains("k") || s.contains("K")) {
				return true;
			}
			return false;
		}
	}
	
	static class Employee{
		private Double salaryDouble;

		public Employee(Double salaryDouble) {
			this.salaryDouble = salaryDouble;
		}

		public Double getSalaryDouble() {
			return salaryDouble;
		}

		@Override
		public String toString() {
			return "Employee [salaryDouble=" + salaryDouble + "]";
		}

		
	}
	
	static class StrLengthCondition3 implements Predicate<Employee> {
		
		public boolean test(Employee e) {
			if (e.getSalaryDouble()<60000) {
				return true;
			}
			return false;
		}
	}
	
static class StrLengthCondition4 implements Predicate<Integer> {
		
		public boolean test(Integer i) {
			if (i>100) {
				return true;
			}
			return false;
		}
	}
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("MAROKS");
				add("Goodbye");
				add("Kamal");
				add("Malek");
			}
		};
		System.out.println(conditionalRemove(list,new StrLengthCondition2()));
		
		
		ArrayList<Employee> list2 = new ArrayList<Employee>() {
			{
				add(new Employee(22000.0));
				add(new Employee(23000.0));
				add(new Employee(25000.0));
				add(new Employee(21000.0));
				add(new Employee(1200000.0));
			}
		};
		System.out.println(conditionalRemove(list2,new StrLengthCondition3()));
		
		ArrayList<Integer> list3 = new ArrayList<Integer>() {
			{
				add(13);
				add(23);
				add(1);
				add(2000);
			}
		};
		System.out.println(conditionalRemove(list3,new StrLengthCondition4()));
	}
	public static <T> List<T> conditionalRemove(ArrayList<T> list,Predicate<T> cond) {
		
		//StrLengthCondition cond = new StrLengthCondition();
		
		/*
		 
			 for(T s : list) {
				if(cond.test(s)) {
					list.remove(s);
				}
			 }
		 
		 
		 */
		
		
		Iterator<T> iterator=list.iterator();
		while (iterator.hasNext()) {
			T t=iterator.next();
			if(cond.test(t)) {
				iterator.remove();
			}
			
		}
		return list;
	}

}
