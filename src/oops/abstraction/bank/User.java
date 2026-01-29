package oops.abstraction.bank;

public class User extends useBank{
   String name;
   String mailId;
   String password;
   long phoneNumber;
   int age;
   char gender;
   String Address;
   
   User(String name, String mailId, String password, long phoneNumber, int age, char gender, String Address)
   {
	   this.name = name;
	   this.mailId = mailId;
	   this.password = password;
	   this.phoneNumber = phoneNumber;
	   this.age = age;
	   this.gender = gender;
	   this.Address = Address;
   }
   
   public static void main(String[] args) {
	    User u = new User("Sudeshna" , "pathaksudeshna92@gmail.com" , "123@456" , 8825250158l , 22 , 'F' , "Kolkata");
	    u.deposit();
	    u.withdraw();
	    u.fundTransfer();
	    u.checkBalance();
	    u.resetPassword();
	    u.loan();
	    u.fixedDeposit();
   }
   
}
