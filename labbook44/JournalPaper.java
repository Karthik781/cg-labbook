package labbook44;

public class JournalPaper extends WrittenItem {
	
	private int yearPublished;
	public JournalPaper(int identificationNumber, String title, int noOfCopies, String author, int yearPublished ) {
		super(identificationNumber, title, noOfCopies, author);
		this.yearPublished = yearPublished;
	}

	@Override
	int addItem() {
		System.out.println("New Journal added with ID: " + super.getIdentificationNumber());
		return 0;
	}

	@Override
	int print() {
		super.print();
		System.out.println("Published Year: "+ getYearPublished());
		return 0;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

}
