package prog1.partE;

public class D implements B, C{
	
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}

	@Override
	public void method() {
		C.super.method();
	}
}
