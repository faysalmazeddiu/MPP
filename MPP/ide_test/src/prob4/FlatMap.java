package prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String[] args) {
		List<Emploeey> list1=new ArrayList<>();
		list1.add(new Emploeey("Mazed", 2000.0));
		list1.add(new Emploeey("sazed",34000.0));
		
		
		List<Emploeey> list2=new ArrayList<>();
		list2.add(new Emploeey("sajib", 4500.0));
		list2.add(new Emploeey("himal",50000.0));
		
		List<List<Emploeey>> mainList = new ArrayList<>();
		mainList.add(list1);
		mainList.add(list2);
		
		System.out.println(
			mainList.stream().flatMap(e->e.stream())
			.map(e->e.getNameString()).collect(Collectors.toList())
		);
	}

}

class Emploeey{
	private String nameString;
	private Double salaryDouble;
	public Emploeey(String nameString, Double salaryDouble) {
		
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
