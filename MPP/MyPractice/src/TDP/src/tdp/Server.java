package TDP.src.tdp;

public class Server extends ComputerTemplate{

	@Override
	protected void installOS() {
		System.out.println("Installing Ubuntu");
	}

	@Override
	protected void assembleComponents() {
		System.out.println("Joining all units, 0 HDMI, 1 VGA port");
	}


}
