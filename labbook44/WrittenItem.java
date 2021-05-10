package labbook44;

public abstract class WrittenItem extends Item{
	
	private String author;
	
	public WrittenItem(int identificationNumber, String title, int noOfCopies, String author) {
		super(identificationNumber, title, noOfCopies);
		this.author = author;
	}
	
	@Override
	int print() {
		System.out.println("ID: " + this.getIdentificationNumber());
		System.out.println("Title: "+ this.getTitle());
		System.out.println("No of copies: "+ this.getNoOfCopies());
		System.out.println("Author: "+ this.getAuthor());
		return 0;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}


}
