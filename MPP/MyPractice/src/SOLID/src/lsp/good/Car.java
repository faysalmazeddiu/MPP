package SOLID.src.lsp.good;

public class Car extends TransportationDeviceWithEngine {
	
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
