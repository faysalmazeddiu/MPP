package prob4.properties;

public class Trailer extends Property{
	private Address address;
	double rent = 500;
	
	
	public Trailer(Address address){
		this.address = address;
	}
	@Override
	public double computeRent() {
		return rent;
	}

	

}
