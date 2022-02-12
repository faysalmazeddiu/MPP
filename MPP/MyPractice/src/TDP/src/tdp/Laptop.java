package TDP.src.tdp;

public class Laptop extends ComputerTemplate{

	@Override
	protected void installOS() {
		System.out.println("Installing windows");
	}

	@Override
	protected void assembleComponents() {
		System.out.println("Joining all units, plus 4 HDMI ports");
	}

}
