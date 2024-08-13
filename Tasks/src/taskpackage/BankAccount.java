package taskpackage;

public class BankAccount {

	int accountno;
	Double balance;
	String name;
	
	public BankAccount(String x, int y, Double z) {
		
		accountno = y;
		balance = z;
		name = x;
	}
	
	public void deposit (Double x) {
		
		balance -= x;
		
		System.out.println("New balance: £" + balance);
		
	}
	
	public void withdraw (Double x) {
			
		balance += x;
			
		System.out.println("New balance: £" + balance);
			
	}
	public void showBalance() {
		System.out.println("balance: £" + balance);
	}
}

class SavingsAccount extends BankAccount {

	
	public SavingsAccount(String x, int y, Double z) {
		super(x, y, z);
		accountno = y;
		balance = z;
		name = x;
	}
	public void applyinterest() {
		balance *= 1.1;
		System.out.println("New Balance: £" + balance);
	}
	
	public static void main(String[] args) {
		
		SavingsAccount save1 = new SavingsAccount("Rob", 23452345, 23432.34);
		
		System.out.println(save1.accountno);
		
		save1.showBalance();
		save1.applyinterest();
	}
	
	
	
}
