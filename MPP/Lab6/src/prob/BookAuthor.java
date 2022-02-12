package prob;

import java.io.Serializable;

final public class BookAuthor implements Serializable {
	
	

	public BookAuthor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;

}
