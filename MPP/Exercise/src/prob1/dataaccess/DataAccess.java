package prob1.dataaccess;

import prob1.business.Book;
import prob1.business.LibraryMember;

import java.util.HashMap;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
