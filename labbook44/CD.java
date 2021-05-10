package labbook44;

public class CD extends MediaItem {
	
	private String artist;
	
	public CD(int identificationNumber, String title, int noOfCopies, int runtime, String artist,String genre) {
		super(identificationNumber, title, noOfCopies, runtime, genre);
		this.artist =artist;
		}

	@Override
	int addItem() {
		System.out.println("New CD added with ID: " + super.getIdentificationNumber());
		return 0;
	}

	@Override
	int print() {
		super.print();
		System.out.println("Artist: "+ this.artist);
		return 0;
	}
	
	int videoFormat() {
		System.out.println("MKV CD format");
		return 0;
	}

}
