package labbook44;

public abstract class MediaItem extends Item {
	
	private int runtime;
	private String genre;
	public MediaItem(int identificationNumber, String title, int noOfCopies, int runtime, String genre) {
		super(identificationNumber, title, noOfCopies);
		this.runtime = runtime;
		this.genre = genre;
		}
	
	abstract int videoFormat();
	
	@Override
	int print() {
		System.out.println("ID: " + this.getIdentificationNumber());
		System.out.println("Title: "+ this.getTitle());
		System.out.println("No of copies: "+ this.getNoOfCopies());
		System.out.println("Runtime: "+ this.getRuntime());
		System.out.println("Genre: "+ this.genre);
		return 0;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
