package prob;

import java.io.Serializable;

public class CustomException extends Exception implements Serializable {

	public CustomException() {
		super();
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(Throwable throwable) {
		super(throwable);
	}
	private static final long serialVersionUID = 8978723266036027364L;
	
}
