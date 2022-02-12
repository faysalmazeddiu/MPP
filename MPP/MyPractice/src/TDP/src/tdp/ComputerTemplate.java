package TDP.src.tdp;

public abstract class ComputerTemplate {

	public final void buildComputer() {
		collectComponents(); // ram, fan, gpu, opu
		assembleComponents();
		installOS();
		startComputer();
		System.out.println("Computer is on");
	}

	private void collectComponents() {
		System.out.println("Computer with 4GB Ram, 1 TB HDD, 4GB Graphics card and USB port.");
	}
	
	private void startComputer() {
		System.out.println("System is booting");
	}
	
	protected abstract void installOS();

	protected abstract void assembleComponents();
}
