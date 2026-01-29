package oops.abstraction.bank;

public class User extends useBank{
   private String name;
   private String mailId;
   private String password;
   private long phoneNumber;
   private int age;
   private char gender;
   private String Address;
   
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
   
   
   
   public String getName() {
	return name;
}



   public void setName(String name) {
	this.name = name;
   }



   public String getMailId() {
	return mailId;
   }



   public void setMailId(String mailId) {
	this.mailId = mailId;
   }



   public long getPhoneNumber() {
	return phoneNumber;
   }



   public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
   }



   public int getAge() {
	return age;
   }



   public void setAge(int age) {
	this.age = age;
   }



   public char getGender() {
	return gender;
   }



   public void setGender(char gender) {
	this.gender = gender;
   }



   public String getAddress() {
	return Address;
   }



   public void setAddress(String address) {
	Address = address;
   }

   
   public String getPassword() {
	return password;
   }

   public void resetPassword(String password) {
		this.password = password;
	}
   
   public static void main(String[] args) {
	    User u = new User("Sudeshna" , "pathaksudeshna92@gmail.com" , "123@456" , 8825250158l , 22 , 'F' , "Kolkata");
	    u.deposit();
	    u.withdraw();
	    u.fundTransfer();
	    u.checkBalance();
	    u.resetPassword("123456@78");
	    System.out.println(u.getPassword());
	    u.loan();
	    u.fixedDeposit();
   }
   
}
