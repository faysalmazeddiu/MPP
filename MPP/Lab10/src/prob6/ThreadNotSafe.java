package prob6;

public class ThreadNotSafe {
	
	static Queue queue = new Queue();
	
	public static void main(String[] args) {	
		for(int index = 0; index < 10; ++index) {
			multipleCalling();
			System.out.println("Num instances: ");
		}		
	}
	public static void multipleCalling() {
		Runnable r = () -> {
			for(int index = 0; index < 500; ++index) {
				queue.add(index);
			}
		};
		for(int index = 0; index < 100; ++index) {
			new Thread(r).start();			
		}
	}

}
