package labbook44;

public class Video extends MediaItem{
	
	private String director;
	private int yearReleased;
	
	public Video(int identificationNumber, String title, int noOfCopies, int runtime, String director, String  genre, int yearReleased) {
		super(identificationNumber, title, noOfCopies, runtime, genre );
		this.director = director;
		this.yearReleased = yearReleased;
	}

	@Override
	int addItem() {
		System.out.println("New Video added with ID: " + super.getIdentificationNumber());
		return 0;
	}

	@Override
	int print() {
		super.print();
		System.out.println("Director: "+ this.director);
		System.out.println("Year Released: "+ this.yearReleased);
		return 0;
	}
	
	int videoFormat() {
		System.out.println("MP4 format");
		return 0;
	}

}
