package prob4.properties;

public class House extends Property{
	private double rent = 0.1;
	private Address address;
	private double lotsize = 0;
	
	
	public House(double lotsize,Address address){
		this.lotsize = lotsize;
		this.address = address;
	}
	@Override
	public double computeRent() {
		double rentOfHouse=rent * lotsize;
		return rentOfHouse;
	}



	
	
}
