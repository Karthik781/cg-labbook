package labbook4;

public class CurrentAccount extends BankAccount {
	
	 private double overDraftlimit = 2000;
	 CurrentAccount(String name, int age) {
		super(name, age);
	}
	 
	 @Override
	 public void withdraw(double amount) {
		 if(amount <= super.getBalance()) {
			 super.withdraw(amount);
		 }else {
			 if(amount <= super.getBalance() + overDraftlimit) {
				 double overDraftlimitAmount = amount - super.getBalance();
				 setOverDraftlimit(overDraftlimitAmount);
				 super.deposite(overDraftlimitAmount);
				 super.withdraw(amount);
			 }else {
				 System.err.println("Over Draft Limit exceded!");
			 }
			 System.out.println("Overdraft amount left: "+getOverDraftlimit());
			 System.out.println("Overdraft due: "+(2000 - getOverDraftlimit()));
		 }
	 }

	public double getOverDraftlimit() {
		return overDraftlimit;
	}

	public void setOverDraftlimit(double amount) {
		this.overDraftlimit = overDraftlimit - amount;
	}

} 
