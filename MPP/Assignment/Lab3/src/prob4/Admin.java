package prob4;

import prob4.properties.Property;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRentOfProperties = 0;
		for (Property val : properties) {
			totalRentOfProperties += val.computeRent();
		}

		return totalRentOfProperties;
	}
	
	
}
