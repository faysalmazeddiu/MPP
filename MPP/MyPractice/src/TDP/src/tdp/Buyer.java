package TDP.src.tdp;

public class Buyer {
	
	//This is Template Design Pattern example
	
	public static void main(String[] args) {
		//laptop
		ComputerTemplate laptop = new Laptop();
		laptop.buildComputer();
		System.out.println("==========server=========");
		//server
		ComputerTemplate server = new Server();
		server.buildComputer();
	}

}
