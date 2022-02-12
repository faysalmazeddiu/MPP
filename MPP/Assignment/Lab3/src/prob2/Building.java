package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> listOfApartment=new ArrayList<Apartment>();
	private double cost;
	
	public Building(double cost, List<Apartment> apartmentList) {
		this.cost=cost;
		this.listOfApartment.addAll(apartmentList);
	}
	
	public double getCost() {
		return cost;
	}
	
	public double generateProfit() {
		double sum=0;
		for(Apartment ap:listOfApartment) {
			sum+=(ap.getRent());
		}
		sum-=cost;
		return sum;
	}
	
	
}
