package SOLID.src.ocp.good;

public class Calculator {
	
	public void calculate(Operation operation) throws Exception{
		if (operation == null) {
			throw new Exception("Can not perform operation.");
		}
		
		operation.perform();
	}
	
	public static void main(String[] args) throws Exception {
		Calculator obj = new Calculator();
		Addition add = new Addition(10, 5);
		obj.calculate(add);
		
		System.out.println("result: "+add.result);
		
		Substraction sub = new Substraction(10, 5);
		obj.calculate(sub);
		
		System.out.println("result: "+sub.result);
		
		Multiplication mult = new Multiplication(10, 5);
		obj.calculate(mult);
		
		System.out.println("result: "+mult.result);
		
		Division div = new Division(10, 5);
		obj.calculate(div);
		
		System.out.println("result: "+div.result);
	}

}
