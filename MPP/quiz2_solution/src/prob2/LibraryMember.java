package prob2;



public class LibraryMember {
	private String memberId;
    private String firstName;
    private String lastName;
    private String phone;
    CheckoutRecord checkoutRecord;

    public LibraryMember(String id, String fname, String lname, String phone) {
        memberId = id;
        firstName = fname;
        lastName = lname;
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setCheckoutRecord(CheckoutRecord cr) {
        checkoutRecord = cr;

    }
    public CheckoutRecord getCheckoutRecord() {
        return checkoutRecord;
    }
	
}
