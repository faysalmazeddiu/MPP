package prob2;

import java.util.ArrayList;

public class LandlordInfo {
	private ArrayList<Building> listOfBuilding;
	
	public LandlordInfo() {
		listOfBuilding=new ArrayList<>();
	}
	
	public void addBuilding(Building buildingObj) {
		listOfBuilding.add(buildingObj);
	}
	
	
	public double calcProfits() {
		double totalMonthlyProfit=0;
		for(Building b:listOfBuilding) {
			totalMonthlyProfit+=b.generateProfit();
		}
		return totalMonthlyProfit;
	}
	
}
