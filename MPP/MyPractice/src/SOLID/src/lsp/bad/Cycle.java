package SOLID.src.lsp.bad;

public class Cycle extends TransportationDevice{

	public int price = 0;
	
	@Override
	public void setEngineType(String engineType) {
		// Can't do any operation as it cycle has no engine;
	}
}
