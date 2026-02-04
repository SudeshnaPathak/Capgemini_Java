package collectionFramework.UEMBank;

public class SavingsAccount extends Account{
	static long id = 300000;
	private long accountNumber;
	private double balance;
	
	SavingsAccount(String fullName, String emailId, long phoneNumber, String address , double balance)
	{
		super(fullName, emailId, phoneNumber, address);
		this.accountNumber = ++id;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount <= balance)
		{
			this.balance = balance - amount;
			System.out.println(amount + " Withdrawn ");
			return true;
		}
		else System.out.println("Insufficient Balance");
		return false;
	}

	@Override
	public void deposit(double ammount) {
		this.balance = balance + ammount;
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance: " + balance);
	}
}
