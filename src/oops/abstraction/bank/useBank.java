package oops.abstraction.bank;

import oops.abstraction.Bank;

public class useBank implements Bank{
	public void deposit() {
		System.out.println("Deposit Money");
	}
	
	public void withdraw(){
		System.out.println("Withdraw Money");
	}
	
	public void fundTransfer() {
		System.out.println("Fund Transfer");
	}
	
	public void checkBalance() {
		System.out.println("Check your Current Balance");
	}
	
	public void resetPassword() {
		System.out.println("Reset Password");
	}
	
	public void loan()
	{
		System.out.println("Take loan");
	}
	
	public void fixedDeposit()
	{
		System.out.println("Create FD");
	}
}
