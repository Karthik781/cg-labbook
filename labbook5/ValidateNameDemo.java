package labbook5;

public class ValidateNameDemo {

	public static void main(String[] args) {
		ValidateName obj = new ValidateName();
		
		try {
			obj.checkName("karthik", null);
			obj.checkName(null, null);
		} catch (NameInvalidException e) {
			System.out.println(e);
		}
	}

}
