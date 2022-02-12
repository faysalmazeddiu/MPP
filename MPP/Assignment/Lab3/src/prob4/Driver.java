package prob4;

import prob4.properties.Address;
import prob4.properties.Condo;
import prob4.properties.House;
import prob4.properties.Property;
import prob4.properties.Trailer;
public class Driver {

	public static void main(String[] args) {

		Address addressforHouse = new Address("FareFeild"," 4th Street 2000","Iowa","52557");
		Address addressForCondonium = new Address("FareFeild"," 2th Street 3000","Iowa","52556");
		Address addressForTrailor = new Address("FareFeild"," 1th Street 4000","Iowa","52555");
		Property[] properties = { 
				    new House(9000,addressforHouse), 
					new Condo(2,addressForCondonium), 
					new Trailer(addressForTrailor)
				};
		
		
		double totalRent = Admin.computeTotalRent(properties);
		
		System.out.println("Total Rent for all properties is = "+totalRent);
	}
}
