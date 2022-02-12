package innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);
		System.out.println("\n");
		
		System.out.println("Answer for prob1 :");
		prob1();
		System.out.println("\n");
		System.out.println("Answer for prob2 :");
		prob2();
		System.out.println("\n");
		System.out.println("Answer for prob3 :");
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		class SalaryPredicate implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getSalary() > 55000 && e.getSalary() < 120000;
			}
		}
		class MapperClass implements Function<Employee, Pair> {
			public Pair apply(Employee e) {
				return new Pair(e.getName(), e.getSalary());
			}
		}
		//The next two classes use a different approach to sorting
		//than was used in the lambda versions
		class NameCompareFunction implements Function<Pair, String> {
			public String apply(Pair p) {
				return p.name;
			}
		}
		class SalaryCompareFunction implements Function<Pair, Double> {
			public Double apply(Pair p) {
				return -p.salary;
			}
		}
		
		//use this list 
		List<Employee> list = EmployeeTestData.getList();
		System.out.println(list.stream()
	        .filter(new SalaryPredicate())
	        .map(new MapperClass())
	        .sorted(Comparator.comparing(new NameCompareFunction())
	        .thenComparing(new SalaryCompareFunction()))
	        .collect(Collectors.toList()));
		
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		class TransPredicate implements Predicate<Transaction> {
			public boolean test(Transaction t) {
				return t.getYear()==2011;
			}
		}
		class ValueFunction implements Function<Transaction, Integer> {
			public Integer apply(Transaction t) {
				return t.getValue();
			}
		}
		List<Transaction> list = TraderTransactTestData.getTransactions();
		
		System.out.println(
				
				list.stream()
		        .filter(new TransPredicate())
		        .sorted(Comparator.comparing(new ValueFunction()))
		        .collect(Collectors.toList())
				
				
				);
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		class Tpredicate implements Predicate<Transaction>{

			@Override
			public boolean test(Transaction t) {
				if (t.getTrader().getCity().equals("Cambridge")) {
					return true;
				}
				return false;
			}
			
		}
		
		class TraderNameComparie implements Function<Transaction, String>{

			@Override
			public String apply(Transaction t) {
				return t.getTrader().getName();
			}
			
		}
		
		List<Transaction> list = TraderTransactTestData.getTransactions();
		System.out.println(
				list.stream()
				.filter(new Tpredicate())
				.sorted(Comparator.comparing(new TraderNameComparie()))
				.map(t->t.getTrader().getName())
				.distinct()
				.collect(Collectors.toList())
				
				);
		
		
	                
	}
}
