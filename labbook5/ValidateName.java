package labbook5;

public class ValidateName {
	
	public void checkName(String firstname,String secondname) throws NameInvalidException {
		if(firstname == null && secondname == null) {
			throw new NameInvalidException("Invalid Name!! Null!!!");
		}else {
			System.out.println("Valid Name!!!");
		}
	}

}
