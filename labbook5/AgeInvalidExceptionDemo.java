package labbook5;

public class AgeInvalidExceptionDemo {

	public static void main(String[] args) {

		ValidateAge obj = new ValidateAge();
		try {
			obj.checkAge(20);
			obj.checkAge(12);			
		} catch (AgeInvalidException e) {
			System.out.println("Exception occurred " + e);
		}
	}

}
