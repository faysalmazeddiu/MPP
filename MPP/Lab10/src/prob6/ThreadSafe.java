package prob6;

public class ThreadSafe {

	static ThreadSafeQueue queue = new ThreadSafeQueue();

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			multipleCalling();
			System.out.println("Num instances: ");
		}
	}

	public static void multipleCalling() {
		Runnable r = () -> {
			for (int index = 0; index < 500; ++index) {
				try {
					queue.add(index);
				} catch (InterruptedException exception) {
					exception.printStackTrace();
				}
			}
		};
		for (int index = 0; index < 100; ++index) {
			new Thread(r).start();
		}
	}
}
