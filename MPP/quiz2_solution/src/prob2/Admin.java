package prob2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		phoneNums = Stream.of(members)
				.filter(mem->mem.getCheckoutRecord()
						.getCheckoutEntryList()
				.stream()
				.anyMatch(x->x.getLendingItem().equals(item)))
				.map(mem1->mem1.getPhone())
				.sorted().collect(Collectors.toList());

		return phoneNums;
	}
}
