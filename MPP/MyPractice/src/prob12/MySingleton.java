package prob12;

import java.util.Optional;

public class MySingleton {
	
	private String value;
	private static MySingleton instance = null;

	private MySingleton() {
	}

	public static void main(String[] args) {
		MySingleton instance1, instance2;
		instance1 = getInstance();
		instance2 = getInstance();

		System.out.println(instance1 + "\n" + instance2);

	}

	public static MySingleton getInstance() {
		return Optional.ofNullable(instance).orElseGet(MySingleton::createInstance);
	}

	private static MySingleton createInstance() {
		if (instance == null)
			instance = new MySingleton();
		return instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
