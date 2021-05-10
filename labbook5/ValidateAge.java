package labbook5;

public class ValidateAge {
	public void checkAge(int age) throws AgeInvalidException {
		if(age <= 15) {
			throw new AgeInvalidException("invalid age! should be >15");
		}else {
			System.out.println("Valid Age!!!");
		}
	}
}
