package Interface;

//whenever any new  method signature is added after implementing the interface , the code will break in implementer class

public interface SuperInteface {
	void doSomeThing();
	
}

interface SubInterface extends SuperInteface{
	void makeSomething();
}

class Helper implements SubInterface{

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSomething() {
		// TODO Auto-generated method stub
		
	}
	
}

class Implementer extends Helper{

	@Override
	public void doSomeThing() {
		System.out.println("I implemented SuperIntefce");
		
	}
	
	
}
