package labbook4;


public class BankDemo{
	
	public static void main(String[] args){
		BankAccount obj1 = new BankAccount("Smith", 23);
		System.out.println(obj1);
		obj1.deposite(2000);
		System.out.println(obj1.getAccNum());
		System.out.println(obj1.getAccHolder());
		System.out.println(obj1.getAge());
		System.out.println("Balance " + obj1.getBalance());
		obj1.withdraw(1600);
		System.out.println("Balance " + obj1.getBalance());
		obj1.withdraw(500);
		System.out.println("Balance " + obj1.getBalance());

		System.out.println("-------------------->>>>");
		
		BankAccount obj2 = new SavingsAccount("Adam", 33);
		obj2.deposite(2000);
		System.out.println(obj2.getAccNum());
		System.out.println(obj2.getAccHolder());
		System.out.println(obj2.getAge());
		System.out.println("Balance " + obj2.getBalance());
		obj2.withdraw(1600);
		System.out.println("Balance " + obj2.getBalance());
		obj2.withdraw(500);
		System.out.println("Balance " + obj2.getBalance());
		
		
		System.out.println("-------------------->>>>");
		
		BankAccount obj3 = new CurrentAccount("jack", 43);
		obj3.deposite(1000);
		System.out.println(obj3.getAccNum());
		System.out.println(obj3.getAccHolder());
		System.out.println(obj3.getAge());
		System.out.println("Balance " + obj3.getBalance());
		obj3.withdraw(1400);
		System.out.println("Balance " + obj3.getBalance());
		obj3.withdraw(1000);
		System.out.println("Balance " + obj3.getBalance());
		obj3.withdraw(1000);
		System.out.println("Balance " + obj3.getBalance());
		
		
	}
}

