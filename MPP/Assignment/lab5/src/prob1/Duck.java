package prob1;

public abstract class Duck {
	QuackBehavior quackBehaviorRef;
	FlyBehavior flyBehaviorRef;
	
	public abstract void display();
	public Duck(FlyBehavior flyBehaviorParam, QuackBehavior quackBehaviorParam) {
		this.flyBehaviorRef = flyBehaviorParam;
		this.quackBehaviorRef = quackBehaviorParam;
	}

	public void swim() {
		System.out.println(" Swimming \n");
	}
	public void fly() {
		this.flyBehaviorRef.fly();
	}

	public void quack() {
		this.quackBehaviorRef.quack();
	}
}
