package oops;

class Insta
{
	String userId;
	String password;
	int age;
	String fullName;
	Insta()
	{
		this("ABC@123" , "12345678" , 18 , "Unknown User");
	}
	
	//userId/email
	Insta(String userId)
	{
		this(validateUserId(userId) , "12345678" , 18 , "Unknown User");
	}
	
	//phone number
	Insta(long phoneNumber)
	{
		this(validatePh(phoneNumber) , "12345678" , 18 , "Unknown User");
	}
	
	//userId/email + password
	Insta(String userId , String password)
	{
		this(validateUserId(userId) , password , 18 , "Unknown User");
	}
	
	//phoneNumber + password
	Insta(long phoneNumber , String password)
	{
		this(validatePh(phoneNumber) , password , 18 , "Unknown User");
	}
	
	//userId/email + password + age
	Insta(String userId , String password , int age)
	{
		this(validateUserId(userId) , password , age , "Unknown User");
	}
	
	//phoneNumber + password + age
	Insta(long phoneNumber , String password , int age)
	{
		this(validatePh(phoneNumber) , password , age , "Unknown User");
	}
	
	//userId/email + password + age + fullName
	Insta(String userId , String password , int age , String fullName)
	{
		this.userId = validateUserId(userId);
		this.password = password;
		this.age = age;
		this.fullName = fullName;
	}
	
	//phoneNumber + password + age + fullName
	Insta(long phoneNumber , String password , int age , String fullName)
	{
		this.userId = validatePh(phoneNumber);
		this.password = password;
		this.age = age;
		this.fullName = fullName;
	}
	
	public static String validateUserId(String userId)
	{
		if(userId == null) return null;
		return userId.length() >= 3 ? userId : null;
	}
	
	public static String validatePh(long phoneNumber)
	{
		String ph = Long.toString(phoneNumber);
		return ph.length() == 10 ? ph : null;
	}
}

public class Instagram
{
	public static void main(String[] args)
	{
		Insta i1 = new Insta();
		System.out.println(i1.userId);
		System.out.println(i1.password);
		System.out.println(i1.age);
		System.out.println(i1.fullName);
		
		Insta i2 = new Insta("sudeshna__p");
		System.out.println(i2.userId);
		System.out.println(i2.password);
		System.out.println(i2.age);
		System.out.println(i2.fullName);
		
		Insta i3 = new Insta(8825250158l);
		System.out.println(i3.userId);
		System.out.println(i3.password);
		System.out.println(i3.age);
		System.out.println(i3.fullName);
		
		Insta i4 = new Insta(8820158l);
		System.out.println(i4.userId);
		System.out.println(i4.password);
		System.out.println(i4.age);
		System.out.println(i4.fullName);
		
		Insta i5 = new Insta("sudeshna__p" , "Sudeshna@123");
		System.out.println(i5.userId);
		System.out.println(i5.password);
		System.out.println(i5.age);
		System.out.println(i5.fullName);
		
		Insta i6 = new Insta("sudeshna__p" , "Sudeshna@123" , 22);
		System.out.println(i6.userId);
		System.out.println(i6.password);
		System.out.println(i6.age);
		System.out.println(i6.fullName);
		
		Insta i7 = new Insta("pathaksudeshna92@gmail.com");
		System.out.println(i7.userId);
		System.out.println(i7.password);
		System.out.println(i7.age);
		System.out.println(i7.fullName);
		
		Insta i8 = new Insta("sudeshna__p" , "Sudeshna@123" , 22 , "Sudeshna Pathak");
		System.out.println(i8.userId);
		System.out.println(i8.password);
		System.out.println(i8.age);
		System.out.println(i8.fullName);
		
	}
}
