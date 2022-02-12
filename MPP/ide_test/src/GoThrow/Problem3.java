package GoThrow;

import GoThrow.helperclasses.Book;
import GoThrow.helperclasses.LibraryMember;
import GoThrow.helperclasses.LibrarySystemException;
import GoThrow.helperclasses.TestData;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> participants = TestData.INSTANCE.getMembers();
		p.specialBooks = TestData.INSTANCE.getAllBooks().iterator();
		LibraryMember mem = p.detectIfWinnerDuringCheckout(participants);
		System.out.println("Winner: " + (mem == null ? "none" : mem.getFirstName()));		
		
	}
	Iterator<Book> specialBooks;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {		
		//fix this
		/*
		return mems.stream().filter(mem ->
		       mem.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
		          .getCheckoutRecordEntries().size() == 10)
		    .findFirst().orElse(null);
		*/


		/*

		// by using helper method solution ::::

			return mems.stream().filter(mem ->helperMethod(mem))
					.findFirst().orElse(null);


		*/

		// by using interface solution ::
		return mems.stream().filter(s->PredicateException
				.helper((LibraryMember l)->
						l.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
						.getCheckoutRecordEntries().size()==10).test(s))
				.findFirst().orElse(null);

	}

	public  boolean helperMethod(LibraryMember mems){
		try{
			return mems.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
					.getCheckoutRecordEntries().size() == 10;
		}catch (LibrarySystemException e){
			throw new RuntimeException(e);
		}
	}
}
