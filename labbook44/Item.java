package labbook44;

public abstract class Item {
	
	private int identificationNumber;
	private String title;
	private int noOfCopies;
	
	public Item(int identificationNumber, String title, int noOfCopies ) {
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	int checkIn() {
		System.out.println("Checked into library");
		return 0;
	}
	int checkOut() {
		System.out.println("Checked out of library");
		return 0;
	}
	
	abstract int addItem();
	abstract int print();
	
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}


}
