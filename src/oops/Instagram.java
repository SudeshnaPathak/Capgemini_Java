package oops;

class Insta{
	String userid;
	String password;
	int age;
	String fullname;
	
	Insta(){
		this("ABC@123");
	}
	
	Insta(String userid){
		this(userid , "12345678");
		this.userid = userid;
	}
	
	Insta(long phonenumber)
	{
		String ph = Long.toString(phonenumber);		
		this(ph , "12345678");
		if(ph.length() == 10)this.userid = ph;
		else this.userid = null;
	}
	
	Insta(String userid , String password)
	{
		this(userid , password , 18);
		this.userid = userid;
		this.password = password;
	}
	
	Insta(String userid , String password , int age)
	{
		this(userid , password , age , "Unknown User");
		this.userid = userid;
		this.password = password;
		this.age = age;
	}
	
	Insta(String userid , String password , int age , String fullname)
	{
		this.userid = userid;
		this.password = password;
		this.age = age;
		this.fullname = fullname;
	}
	
}
public class Instagram {

	public static void main(String[] args) {
		Insta i1 = new Insta(88252158l);
		System.out.println(i1.userid);
		System.out.println(i1.password);
		System.out.println(i1.age);
		System.out.println(i1.fullname);

	}

}
