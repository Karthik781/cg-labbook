package labbook44;

public class Library {
	
	void library(Item item) {
		item.checkIn();
		item.addItem();
		item.print();
		if(item instanceof Book) {
			Book book = (Book)item;
	
		}else if(item instanceof JournalPaper) {
			JournalPaper jp = (JournalPaper)item;

		}else if(item instanceof Video) {
			Video video = (Video)item;
			video.videoFormat();
		}else if(item instanceof CD) {
			CD cd = (CD)item;
			cd.videoFormat();
		}
		item.checkOut();
	}

}
