package prob1.business;

import java.util.List;

import prob1.business.Book;
import prob1.dataaccess.DataAccess;
import prob1.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
