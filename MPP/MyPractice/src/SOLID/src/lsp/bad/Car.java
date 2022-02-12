package SOLID.src.lsp.bad;

public class Car extends TransportationDevice {
	
	public int price = 600000;
	
	@Override
	public void setEngineType(String engineType) {
		if (engineType.equals("Petrol")) {
			this.price = this.price + 50000;
		}else {
			this.price = this.price + 100000;
		}
	}
}
