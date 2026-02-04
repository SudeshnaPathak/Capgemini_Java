package collectionFramework.UEMBank;

import java.util.HashMap;
import java.util.Scanner;

import collectionFramework.HospitalManagement.Hospital;
import collectionFramework.HospitalManagement.HospitalUser;

public class Bank {
	static HashMap<Long , Account> userMap= new HashMap<>();
	
	public static void AddUser(long accountNumber, Account account)
	{
		userMap.put(accountNumber, account);
	}
	
	public static void withdraw(long accountNumber , int amount)
	{
			if(userMap.containsKey(accountNumber))
			{
				Account account = userMap.get(accountNumber);
				account.withdraw(amount);
			}
			else System.out.println("Account Doesn't exist");
	}
	
	public static void deposit(long accountNumber , int amount)
	{
			if(userMap.containsKey(accountNumber))
			{
				Account account = userMap.get(accountNumber);
				account.deposit(amount);
			}
			else System.out.println("Account Doesn't exist");
	}
	
	public static void checkBalance(long accountNumber)
	{
			if(userMap.containsKey(accountNumber))
			{
				Account account = userMap.get(accountNumber);
				account.checkBalance();
			}
			else System.out.println("Account Doesn't exist");
	}
	
	public static void MoneyTransfer(long accNum1 , long accNum2 , double amount)
	{ 
		Account acc1 = null, acc2 = null;
		if(userMap.containsKey(accNum1)) acc1 = userMap.get(accNum1);
		if(userMap.containsKey(accNum2)) acc2 = userMap.get(accNum2);
		if(acc1 != null && acc2 != null)
		{
			if(acc1.withdraw(amount))
			{
				acc2.deposit(amount);
			}
			System.out.println("Successfully transferred amount: " + amount);
		    System.out.println(acc1);
		    acc1.checkBalance();
		    System.out.println(acc2);
			acc2.checkBalance();
		}
		else
		{
			System.out.println("Account Doesn't exist");
		}
	}
	
	public static void main(String[] args)
	{
//		System.out.println("Enter the type of account: "
//				+ "1.Savings"
//				+ "2.Salary"
//				+ "3.Current");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		switch(n)
//		{
//		case 1: 
//			{
//				SavingsAccount acc = new SavingsAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 5000);
//				Bank.AddUser(acc.getAccountNumber(), acc);
//				break;
//			}
//		case 2:
//			{
//				SalaryAccount acc = new SalaryAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 5000);
//				Bank.AddUser(acc.getAccountNumber(), acc);
//				break;
//			}
//		case 3:
//			{
//				CurrentAccount acc = new CurrentAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 5000);
//				Bank.AddUser(acc.getAccountNumber(), acc);
//				break;
//			}
//		}
//		Bank.withdraw(200001, 8000);
//		Bank.AddUser(12345, new SavingsAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 5000));
//		Bank.AddUser(12346, new CurrentAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 5000));
//		Bank.MoneyTransfer(12345 , 12346 , 3000);
//		userMap.get(12345l).checkBalance();
//		userMap.get(12346l).checkBalance();
		
		//Integrate Hospital Management
		SavingsAccount acc1 = new SavingsAccount("Hospital", "hospital@gmail.com", 123456789l, "Kolkata" , 500000);
		long accNo1 = acc1.getAccountNumber();
		Bank.AddUser(accNo1, acc1);
		Hospital.setAccNumber(accNo1);
		
		SavingsAccount acc2 = new SavingsAccount("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata" , 150000);
		long accNo2 = acc2.getAccountNumber();
		Bank.AddUser(accNo2, acc2);
		
		HospitalUser admit = new HospitalUser("Sudeshna", "pathaksudeshna92@gmail.com", 8825250158l, "Kolkata", 'F' , 22);
		int userId = Hospital.admission(admit);
		
		SavingsAccount acc3 = new SavingsAccount("Projita", "projita@gmail.com", 8825250158l, "Kolkata" , 150000);
		long accNo3 = acc3.getAccountNumber();
		Bank.AddUser(accNo3, acc3);
		
		HospitalUser admit1 = new HospitalUser("Projita", "projita@gmail.com", 8825250158l, "Kolkata", 'F' , 22);
		int userId1 = Hospital.admission(admit1);
		
		Hospital.payment(userId , accNo2, 50000);
	}
	
}
