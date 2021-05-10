package labbook44;


public class Book extends WrittenItem {

	public Book(int identificationNumber, String title, int noOfCopies, String author) {
		super(identificationNumber, title, noOfCopies, author);
	}

	@Override
	int addItem() {
		System.out.println("New Book added with ID: " + this.getIdentificationNumber());
		return 0;
	}


}
