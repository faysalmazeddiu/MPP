package prob4;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem4Test {
	public static <T> List<T> combine(ArrayList<ArrayList<T>> list) {
		
		ArrayList<T> tList= list.stream().reduce(new ArrayList(), (x,y)->{
			x.addAll(y);
			return x;
		});
		return tList;
		
		
//		return list.stream()
//			.flatMap(e->e.stream()).collect(Collectors.toList());
			
		
		
		//return new ArrayList<T>();	 
	}
	
	public static void testCombine() {
		ArrayList<ArrayList<Emploee>> mainList = new ArrayList<>();
		ArrayList<Emploee> list1 = new ArrayList<Emploee>() {
			{
				add(new Emploee("Mazed", 2000.0));add(new Emploee("sazed",34000.0));
			}
		};
		ArrayList<Emploee> list2 = new ArrayList<Emploee>() {
			{
				add(new Emploee("sajib", 4500.0));add(new Emploee("himal",50000.0));
			}
		};
		mainList.add(list1);
		mainList.add(list2);
		//System.out.println(combine(mainList.stream()));
		System.out.println(combine(mainList));
	}
	public static void main(String[] args) {
		testCombine();
	}
}

class Emploee{
	private String nameString;
	private Double salaryDouble;
	public Emploee(String nameString, Double salaryDouble) {
		
		this.nameString = nameString;
		this.salaryDouble = salaryDouble;
	}
	public String getNameString() {
		return nameString;
	}
	
	public Double getSalaryDouble() {
		return salaryDouble;
	}
	@Override
	public String toString() {
		return "Emploee [nameString=" + nameString + ", salaryDouble=" + salaryDouble + "]";
	}
	
	
	
	
}
