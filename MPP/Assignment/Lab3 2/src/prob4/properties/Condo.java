package prob4.properties;

public class Condo extends Property{
	private Address address;
	private int numFloors;
	private double rent = 400;
	

	public Condo(int numFloors,Address address) {
		this.numFloors = numFloors;
		this.address = address;
	}

	@Override
	public double computeRent() {
		double rentforCondo=this.rent * this.numFloors;
		return rentforCondo;
	}



}
