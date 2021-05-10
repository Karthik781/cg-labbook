package labbook4;

public class BankAccount extends Person {

	private long accNum;
	private double balance;
	private String accHolder;
	final double minBalance = 500.00;
	static long previousAccountNo = 0;

	public BankAccount(String name, int age) {
		super(name, age);
		this.accNum =++previousAccountNo;
		this.balance = minBalance;
		accHolder = this.name;
		System.out.println(this);
	}
	
	public void deposite(double amount) {
		if(amount > 0){
			this.balance = this.balance + amount;
		}
	}
			

	public void withdraw(double amount) {
		if(amount>balance){
			System.err.println("Invalid amount entered, low balance");
		}else {
			this.balance = this.balance - amount;
		}
			
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

}
