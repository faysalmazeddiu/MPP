package prob4.properties;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String city,String street,String state,String zip) {
		this.zip = zip;
		this.street = street;
		this.state = state;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	

}
