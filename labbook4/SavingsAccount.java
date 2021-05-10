package labbook4;

public class SavingsAccount extends BankAccount {
	
	final double minBalance = 500.00;
	public SavingsAccount(String name, int age) {
		super( name, age);
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount>super.getBalance() - minBalance){
			System.err.println("Invalid amount entered");
		}else {
			super.withdraw(amount);
		}
			
	}

}
