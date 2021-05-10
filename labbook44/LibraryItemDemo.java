package labbook44;

public class LibraryItemDemo {

	public static void main(String[] args) {
		
//		book1.addItem();
//		book1.print();
		
		Library lib = new Library();
		
		Book book1 = new Book(123, "java Book", 10, "leo");
		
		lib.library(book1);
		
		System.out.println("<<<<<<------------------>>>>>>");
		
		JournalPaper jp1 = new JournalPaper(101, "junit-5", 5, "smith", 2017);
		lib.library(jp1);
		
		System.out.println("<<<<<<------------------>>>>>>");
		
		Video video = new Video(222, "Sql", 4, 150,"john", "education", 2020);
		lib.library(video);
		
		System.out.println("<<<<<<------------------>>>>>>");

		CD cd = new CD(220, "DBMS", 400, 90,"john", "education");
		lib.library(cd);
	}

}
