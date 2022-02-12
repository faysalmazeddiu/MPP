package prob12;

import java.util.Optional;

public class MySingletonLazy {
	
	/*
		public static MySingletonLazy getInstance() {
		if(instance == null) {
			instance = new MySingletonLazy();
		}
			return instance;
		}
	*/
	
	// rewrite given code::
	
	private static MySingletonLazy instance = null;
	private MySingletonLazy() {}
	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
	}

}

