package SOLID.src.ocp.bad;

public class Calculator {
	
	public void calculate(Object operation) throws Exception{
		if (operation == null) {
			throw new Exception("Can not perform operation.");
		}
		
		if (operation instanceof Addition) {
			Addition obj = (Addition) operation;
			obj.result = obj.a + obj.b;
		}else if (operation instanceof Substraction) {
			Substraction obj = (Substraction) operation;
			obj.result = obj.a - obj.b;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Calculator obj = new Calculator();
		Addition add = new Addition(10, 5);
		obj.calculate(add);
		
		System.out.println("result: "+add.result);
		
		Substraction sub = new Substraction(10, 5);
		obj.calculate(sub);
		
		System.out.println("result: "+sub.result);
	}

}
