package prob2;

public class Book extends LendingItem{
	private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String isbn, String title, String fname, String lname) {
        this.isbn = isbn;
        this.title = title;
        authorFirstName = fname;
        authorLastName = lname;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj))
            return false;

        if (!this.getClass().equals(obj.getClass()))
            return false;

        if (!isbn.equals(((Book) obj).isbn))
            return false;

        if (!title.equals(((Book) obj).title))
            return false;

        if (!authorFirstName.equals(((Book) obj).authorFirstName))
            return false;

        if (!authorLastName.equals(((Book) obj).authorLastName))
            return false;

        return true;
    }
}
